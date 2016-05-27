package org.fundacionjala.automation.tablet.maps;

public class ScheduleTabletMap {
	public static final String organizerField = "txtOrganizer_value";
	public static final String subjectField = "txtSubject";
	public static final String timeInitialField = "//input[@type='time']";
	public static final String timeEndField = "(//input[@type='time'])[2]";
	public static final String createButton = "//button";
	public static final String usernameCredentialField = "(//input[@type='text'])[5]";
	public static final String passwordCredentialField = "//input[@type='password']";
	public static final String saveMeetingButton = "(//button[@type='button'])[2]";
	public static final String meetings = "//div[@class='vis-foreground']/div[@class='vis-group']/*";
	public static final String removeButton = "//button[3]";
	public static final String get_ThemeElement = "//div[@class='ng-scope'][@ui-view='roomView']/*";
	public static final String get_Element = "//div[@class='ng-scope'][@ui-view='roomView']";
}
