$strdcName = "QDV06LSS08001"
$cType = [System.DirectoryServices.ActiveDirectory.DirectoryContextType]::DirectoryServer
$context = New-Object System.DirectoryServices.ActiveDirectory.DirectoryContext($cType, $strdcName)
$dc = [System.DirectoryServices.ActiveDirectory.DomainController]::GetDomainController($context)
Write-Host ("--------------------------------------------------------")
$dc.Name
Write-Host ("--------------------------------------------------------")
Write-Host ("Number of Inbound Connections: " + $dc.InboundConnections.Count)
Write-Host ("--------------------------------------------------------")
$dc.InboundConnections | FL SourceServer
Write-Host ("--------------------------------------------------------")
