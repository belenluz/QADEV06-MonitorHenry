$BridgeServerA = Get-ADSite -name SiteA
$BridgeServerA.BridgeheadServers | select -Property DomainControllerName
Write-Host("Current Bridgeheads Servers " + $BridgeServerA.BridgeheadServers.Count + " for " + $BridgeServerA.SiteName)
Write-Host("-----------------------------------------")
$BridgeServerB = Get-ADSite -name SiteB
$BridgeServerB.BridgeheadServers | select -Property DomainControllerName
Write-Host("Current Bridgeheads Servers " + $BridgeServerB.BridgeheadServers.Count + " for " + $BridgeServerB.SiteName)
Write-Host("-----------------------------------------")


$BridgeServerC = Get-ADSite -name Default-First-Site-Name
$BridgeServerC.BridgeheadServers | select -Property DomainControllerName
Write-Host("Current Bridgeheads Servers " + $BridgeServerC.BridgeheadServers.Count + " for " + $BridgeServerC.SiteName)
Write-Host("-----------------------------------------")


Write-Host("TOTAL Current Bridgeheads Servers " + ($BridgeServerA.BridgeheadServers.Count + $BridgeServerB.BridgeheadServers.Count + $BridgeServerC.BridgeheadServers.Count))