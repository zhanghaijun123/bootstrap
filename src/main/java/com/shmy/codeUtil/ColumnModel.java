package com.shmy.codeUtil;

/**
 * 列模型
 * @Author: zhanghj
 * @Date: 2019/8/29 15:52
 * @Version: 1.0
 */
public class ColumnModel {
    private boolean isPrimaryKey;
    private boolean isAutoIncrement;
    private String columnName;
    private String dataType;
    private String typeName;
    private String columnClassName;
    private String fieldName;
    private String fieldType;
    private int columnSize;
    private String columnDef;
    private String remarks;

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        isPrimaryKey = primaryKey;
    }

    public boolean isAutoIncrement() {
        return isAutoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        isAutoIncrement = autoIncrement;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getColumnClassName() {
        return columnClassName;
    }

    public void setColumnClassName(String columnClassName) {
        this.columnClassName = columnClassName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public String getColumnDef() {
        return columnDef;
    }

    public void setColumnDef(String columnDef) {
        this.columnDef = columnDef;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ColumnModel{" +
                "isPrimaryKey=" + isPrimaryKey +
                ", isAutoIncrement=" + isAutoIncrement +
                ", columnName='" + columnName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", typeName='" + typeName + '\'' +
                ", columnClassName='" + columnClassName + '\'' +
                ", fieldName='" + fieldName + '\'' +
                ", fieldType='" + fieldType + '\'' +
                ", columnSize=" + columnSize +
                ", columnDef='" + columnDef + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
