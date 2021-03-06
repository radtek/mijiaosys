package com.mijiaokj.sys.domain;

/**
 * 
 * @ClassName: ControlFileRelation
 * @Description: TODO 权限文件关系（未实现）
 * @author sunchenguang
 * @eamil scg16@126.com
 * @date 2016年10月14日
 *
 */
public class ControlFileRelation extends ReferenceObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column control_file_relation.file_id
     *
     * @mbggenerated
     */
    private Long fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column control_file_relation.control_id
     *
     * @mbggenerated
     */
    private Long controlId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column control_file_relation.file_id
     *
     * @return the value of control_file_relation.file_id
     *
     * @mbggenerated
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column control_file_relation.file_id
     *
     * @param fileId the value for control_file_relation.file_id
     *
     * @mbggenerated
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column control_file_relation.control_id
     *
     * @return the value of control_file_relation.control_id
     *
     * @mbggenerated
     */
    public Long getControlId() {
        return controlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column control_file_relation.control_id
     *
     * @param controlId the value for control_file_relation.control_id
     *
     * @mbggenerated
     */
    public void setControlId(Long controlId) {
        this.controlId = controlId;
    }
}