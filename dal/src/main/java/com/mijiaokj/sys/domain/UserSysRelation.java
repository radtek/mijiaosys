package com.mijiaokj.sys.domain;

public class UserSysRelation extends ReferenceObject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sys_relation.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_sys_relation.sys_id
     *
     * @mbggenerated
     */
    private Long sysId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sys_relation.user_id
     *
     * @return the value of user_sys_relation.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sys_relation.user_id
     *
     * @param userId the value for user_sys_relation.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_sys_relation.sys_id
     *
     * @return the value of user_sys_relation.sys_id
     *
     * @mbggenerated
     */
    public Long getSysId() {
        return sysId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_sys_relation.sys_id
     *
     * @param sysId the value for user_sys_relation.sys_id
     *
     * @mbggenerated
     */
    public void setSysId(Long sysId) {
        this.sysId = sysId;
    }
}