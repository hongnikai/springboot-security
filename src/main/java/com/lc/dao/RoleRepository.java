package com.lc.dao;

import com.lc.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Long>, JpaSpecificationExecutor<Role> {

    @Query(value = "select r.* from role r, user_role ur where ur.username = ?1 and ur.rid = r.id", nativeQuery = true)
    public List<Role> findRolesOfUser(String username);

    //根据resource的主键查找resource允许的所有权限
    @Query(value = "select r.* from role r, resource_role rr where rr.res_id = ?1 and rr.rid = r.id", nativeQuery = true)
    public List<Role> findRolesOfResource(long resourceId);


}
