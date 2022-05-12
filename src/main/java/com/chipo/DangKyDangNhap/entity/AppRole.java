package com.chipo.DangKyDangNhap.entity;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name = "App_Role", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "APP_ROLE_UK", columnNames = "Role_Name") })
public class AppRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Role_Id", nullable = false)
    private Long roleId;
    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(name = "Role_Name", length = 30, nullable = false)
    private String RoleName;

    public AppRole() {
    }


    public AppRole(Long roleId, String roleName) {
        this.roleId = roleId;
        RoleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long id) {
        this.roleId = id;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }
}
