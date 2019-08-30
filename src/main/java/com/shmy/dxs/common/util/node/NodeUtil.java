package com.shmy.dxs.common.util.node;

import com.shmy.dxs.sys.entity.SysMenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zhanghj
 * @Date: 2019/8/30 13:58
 * @Version: 1.0
 */
public class NodeUtil {
    private static List<SysMenu> returnList = new ArrayList<SysMenu>();

    /**
     * 根据父节点的ID获取所有子节点
     * @param list 分类表
     * @param typeId 传入的父节点ID
     * @return String
     */
    public static List<SysMenu> getChildNodes(List<SysMenu> list, Long typeId) {
        returnList = new ArrayList<SysMenu>();
        if(list == null && typeId == null) return new ArrayList<SysMenu>();
        for (Iterator<SysMenu> iterator = list.iterator(); iterator.hasNext();) {
            SysMenu node = (SysMenu) iterator.next();
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (node.getParentId()==0 && typeId==node.getId()) {
                recursionFn(list, node);
            }
            // 二、遍历所有的父节点下的所有子节点
            if (node.getParentId()==0) {
                recursionFn(list, node);
            }
        }
        // 对顶层菜单按照treeOrder从大到小进行进行排序
        Collections.sort(returnList);
        return returnList;
    }

    private static void recursionFn(List<SysMenu> list, SysMenu node) {
        List<SysMenu> childList = getChildList(list, node);// 得到子节点列表
        if (hasChild(list, node)) {// 判断是否有子节点
            Iterator<SysMenu> it = childList.iterator();
            while (it.hasNext()) {
                SysMenu n = (SysMenu) it.next();
                if(hasChild(list,n)){// 判断子节点是否还有相应的子节点，若有则再次递归遍历
                    recursionFn(list, n);
                }
            }
            node.setChild(childList);
            returnList.add(node);
        }
    }

    // 得到子节点列表
    private static List<SysMenu> getChildList(List<SysMenu> list, SysMenu node) {
        List<SysMenu> nodeList = new ArrayList<SysMenu>();
        Iterator<SysMenu> it = list.iterator();
        while (it.hasNext()) {
            SysMenu n = (SysMenu) it.next();
            if (n.getParentId() == node.getId()) {
                nodeList.add(n);
            }
        }
        Collections.sort(nodeList);
        return nodeList;
    }

    // 判断是否有子节点
    private static boolean hasChild(List<SysMenu> list, SysMenu node) {
        return getChildList(list, node).size() > 0 ? true : false;
    }
}
