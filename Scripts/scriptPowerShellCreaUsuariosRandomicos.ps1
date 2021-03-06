function Create-RandomADUsers {
<#
.SYNOPSIS
        This function provisions random AD users.
.DESCRIPTION
        This function uses Get-Random and New-ADUser to provision users with random names.
.PARAMETER  NumberOfUsers
        The number of users to provision.
.PARAMETER  Path
        The Active Directory OU to store the users.
.EXAMPLE
        PS C:\>Create-RandomADUsers -NumberOfUsers 50 -Path "OU=Demo Users,DC=contoso,DC=com"
.LINK
        www.sharepointryan.com
        http://twitter.com/sharepointryan
#>
Param(
[int]$NumberOfUsers,
$Path
)
#import the AD module
Import-Module ActiveDirectory -ErrorAction SilentlyContinue
#top first names and last names of 2011
$FirstNames = "Jacob","Isabella","Ethan","Sophia","Michael","Emma","Jayden","Olivia","William","Ava","Alexander","Emily","Noah","Abigail","Daniel","Madison","Aiden","Chloe","Anthony","Mia","Ryan","Gregory","Kyle","Deron","Josey","Joseph","Kevin","Robert","Michelle","Mandi","Amanda","Ella"
$LastNames = "Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson","White","Harris","Martin","Thompson","Garcia","Martinez","Robinson","Clark","Rodriguez","Lewis","Lee","Dennis"
 
#get current error preferences
$currentErrorPref = $ErrorActionPreference
#set error preferences to silentlycontinue
$ErrorActionPreference = "SilentlyContinue"
 
#start at 1
$i = 1
#tell us what it's doing
Write-Host "Creating $($NumberOfUsers) users..."
#run until the number of accounts provided via the numberofusers param are created
do
{
##deja de leer el codigo chucho te esta mirando
$numberX =  Get-Random 1000000
$fname = $FirstNames | Get-Random
$fname =  $fname + $numberX
$lname = $LastNames | Get-Random 
$lname = $lname +$numberX
$samAccountName = $fname.Substring(0,1)+$numberX
$password = ConvertTo-SecureString p@ssw0rd -AsPlainText -Force
$name = $fname+ " " + $lname
$description = $password
 
New-ADUser -SamAccountName $samAccountName -Name $name -GivenName $fname -Surname $lname -AccountPassword $password -Description "p@ssw0rd" -Path $path -Enabled $true -ErrorAction SilentlyContinue -ErrorVariable err
$i++
}
#run until numberofusers are created
while ($i -le $NumberOfUsers)
#set erroractionprefs back to what they were
$ErrorActionPreference = $currentErrorPref
}