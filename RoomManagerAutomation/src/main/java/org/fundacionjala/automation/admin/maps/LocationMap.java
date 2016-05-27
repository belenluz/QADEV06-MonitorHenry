package org.fundacionjala.automation.admin.maps;

public class LocationMap {
	public static final String addLocationButton = "//button[@href='#/admin/locations'][@ui-sref='admin.locations.modal.add']/descendant::span[text()='Add']";
	public static final String locationNameField = "location-add-name";
	public static final String locationDisplayNameField = "location-add-display-name";
	public static final String locationDescriptionField = "location-add-description";
	public static final String saveLocationButton = "//button[@ng-click='save()'][@class='btn btn-primary']/descendant::span[text()='Save']";
	public static final String removeLocationButton = "//button[@href='#/admin/locations'][@ui-sref='admin.locations.remove']/descendant::span[text()='Remove']";
	public static final String removeLocationConfirmationButton = "//button[@ng-click='removeLocations()'][@class='btn btn-primary']/descendant::span[text()='Remove']";
}
