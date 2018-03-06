package com.rakesh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Integer id;

	private Integer userId;

	private String sound;

	private String desktopAlerts;

	private String offAlertTime;

	private String chatWallpaperColor;

	private String userIcon;

	public UserProfile() {
	}

	public UserProfile(Integer id, Integer userId, String sound, String desktopAlerts, String offAlertTime,
			String chatWallpaperColor, String userIcon) {
		super();
		this.id = id;
		this.userId = userId;
		this.sound = sound;
		this.desktopAlerts = desktopAlerts;
		this.offAlertTime = offAlertTime;
		this.chatWallpaperColor = chatWallpaperColor;
		this.userIcon = userIcon;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getDesktopAlerts() {
		return desktopAlerts;
	}

	public void setDesktopAlerts(String desktopAlerts) {
		this.desktopAlerts = desktopAlerts;
	}

	public String getOffAlertTime() {
		return offAlertTime;
	}

	public void setOffAlertTime(String offAlertTime) {
		this.offAlertTime = offAlertTime;
	}

	public String getChatWallpaperColor() {
		return chatWallpaperColor;
	}

	public void setChatWallpaperColor(String chatWallpaperColor) {
		this.chatWallpaperColor = chatWallpaperColor;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", userId=" + userId + ", sound=" + sound + ", desktopAlerts=" + desktopAlerts
				+ ", offAlertTime=" + offAlertTime + ", chatWallpaperColor=" + chatWallpaperColor + ", userIcon="
				+ userIcon + "]";
	}

}
