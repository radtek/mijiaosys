package com.mijiaokj.sys.domain;

/**
 * 
 * @ClassName: ResControl
 * @Description: TODO 资源操作表
 * @author sunchenguang
 * @eamil scg16@126.com
 * @date 2016年10月14日
 *
 */
public class ResControl extends ReferenceObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column control.control_code
     * 操作图标
     * @mbggenerated
     */
    private String controlIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column control.control_name
     * 操作名称
     * @mbggenerated
     */
    private String controlName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column control.control_url
     * 操作地址
     * @mbggenerated
     */
    private String controlUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column control.control_code
     *
     * @return the value of control.control_code
     *
     * @mbggenerated
     */
    public String getControlIcon() {
        return controlIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column control.control_code
     *
     * @param controlIcon the value for control.control_code
     *
     * @mbggenerated
     */
    public void setControlIcon(String controlIcon) {
        this.controlIcon = controlIcon == null ? null : controlIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column control.control_name
     *
     * @return the value of control.control_name
     *
     * @mbggenerated
     */
    public String getControlName() {
        return controlName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column control.control_name
     *
     * @param controlName the value for control.control_name
     *
     * @mbggenerated
     */
    public void setControlName(String controlName) {
        this.controlName = controlName == null ? null : controlName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column control.control_url
     *
     * @return the value of control.control_url
     *
     * @mbggenerated
     */
    public String getControlUrl() {
        return controlUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column control.control_url
     *
     * @param controlUrl the value for control.control_url
     *
     * @mbggenerated
     */
    public void setControlUrl(String controlUrl) {
        this.controlUrl = controlUrl == null ? null : controlUrl.trim();
    }
}