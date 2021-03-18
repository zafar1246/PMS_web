package com.omaisss.pmsclient.restdomainobjects;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.omaisss.pmsclient.restentity.AppRole;
import com.omaisss.pmsclient.restentity.AppUser;

public class PMSUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;

	public PMSUserDetails(AppUser user) {
		this.userName = user.getUserName();
		this.password = user.getPasswordHash();
		this.active = user.getIsActive() == 'Y' ? true : false;

		for (AppRole appRole : user.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(appRole.getRoleName()));
		}

	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
	}

	@Override
	public String getPassword() {

		return password;
	}

	@Override
	public String getUsername() {

		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}
