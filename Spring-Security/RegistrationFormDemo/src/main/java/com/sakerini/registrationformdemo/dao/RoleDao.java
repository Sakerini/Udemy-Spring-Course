package com.sakerini.registrationformdemo.dao;

import com.sakerini.registrationformdemo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
