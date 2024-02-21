package com.backend.project.service;

import com.backend.project.entities.Admin;

public interface AdminService {

	Admin validate(String email, String password);

	void updateAdmin(Admin admin);

	Admin findByEmail(String email);

	void resetPassword(Admin admin, String password);

}
