Assets
======

.. contents::
   :depth: 2
   :local:

.. _asset_iamobject:

IAMObject
^^^^^^^^^

.. _asset_iamobject_notpresent:

notPresent
""""""""""

attemptAssume
"""""""""""""
successfulAssume
""""""""""""""""
assume
""""""
deny
""""
write
"""""
attemptLockout
""""""""""""""
successfulLockout
"""""""""""""""""
lockout
"""""""

.. _asset_identity:

Identity
^^^^^^^^
assume
""""""
lockoutFromCredentials
""""""""""""""""""""""

.. _asset_identity_lockout:

lockout
"""""""

.. _asset_privileges:

Privileges
^^^^^^^^^^
assume
""""""

.. _asset_group:

Group
^^^^^
assume
""""""
lockoutFromMembers
""""""""""""""""""

.. _asset_credentials:

Credentials
^^^^^^^^^^^

.. _asset_credentials_notdisclosed:

notDisclosed
""""""""""""

.. _asset_credentials_notguessable:

notGuessable
""""""""""""

.. _asset_credentials_unique:

unique
""""""

.. _asset_credentials_notPhishable:

notPhishable
""""""""""""

read
""""
write
"""""
deny
""""
useLeakedCredentials
""""""""""""""""""""
attemptCredentialsReuse
"""""""""""""""""""""""
credentialsReuse
""""""""""""""""
use
"""
attemptPropagateOneCredentialCompromised
""""""""""""""""""""""""""""""""""""""""
propagateOneCredentialCompromised
"""""""""""""""""""""""""""""""""
attemptCredentialTheft
""""""""""""""""""""""
credentialTheft
"""""""""""""""
weakCredentials
"""""""""""""""
guessCredentialsFromHash
""""""""""""""""""""""""
guessCredentials
""""""""""""""""

.. _asset_information:

Information
^^^^^^^^^^^

.. _asset_information_read:

read
""""

.. _asset_information_write:

write
"""""

.. _asset_information_delete:

delete
""""""

.. _asset_information_deny:

deny
""""

.. _asset_information_extract:

extract
"""""""
attemptReadFromReplica
""""""""""""""""""""""
attemptWriteFromReplica
"""""""""""""""""""""""
attemptDeleteFromReplica
""""""""""""""""""""""""
attemptDenyFromReplica
""""""""""""""""""""""
attemptExtractFromReplica
"""""""""""""""""""""""""

.. _asset_data:

Data
^^^^
authorizedAccessFromApplication
"""""""""""""""""""""""""""""""
bypassPayloadInspectionFromEncryptedData
""""""""""""""""""""""""""""""""""""""""
accessUnencryptedData
"""""""""""""""""""""
accessUnsignedData
""""""""""""""""""
accessSpoofedData
"""""""""""""""""
accessDecryptedData
"""""""""""""""""""
attemptApplicationRespondConnect
""""""""""""""""""""""""""""""""
applicationRespondConnect
"""""""""""""""""""""""""
authorizedApplicationRespondConnectFromApplication
""""""""""""""""""""""""""""""""""""""""""""""""""
authorizedApplicationRespondConnectFromIAM
""""""""""""""""""""""""""""""""""""""""""
authorizedApplicationRespondConnect
"""""""""""""""""""""""""""""""""""
attemptRead
"""""""""""
successfulRead
""""""""""""""

.. _asset_data_read:

read
""""

authorizedReadFromIAM
"""""""""""""""""""""
authorizedReadFromApplication
"""""""""""""""""""""""""""""
authorizedRead
""""""""""""""
attemptWrite
""""""""""""
successfulWrite
"""""""""""""""

.. _asset_data_write:

write
"""""
authorizedWriteFromIAM
""""""""""""""""""""""
authorizedWriteFromApplication
""""""""""""""""""""""""""""""
authorizedWrite
"""""""""""""""
attemptDelete
"""""""""""""
successfulDelete
""""""""""""""""

.. _asset_data_delete:

delete
""""""
authorizedDeleteFromIAM
"""""""""""""""""""""""
authorizedDeleteFromApplication
"""""""""""""""""""""""""""""""
authorizedDelete
""""""""""""""""
attemptDeny
"""""""""""
successfulDeny
""""""""""""""

.. _asset_data_deny:

deny
""""
denyFromLockout
"""""""""""""""
attemptReverseReach
"""""""""""""""""""
reverseReach
""""""""""""
extract
"""""""

.. _asset_hardware:

Hardware
^^^^^^^^
attemptUseVulnerabilityFromPhysicalAccess
"""""""""""""""""""""""""""""""""""""""""
successfulUseVulnerabilityFromPhysicalAccess
""""""""""""""""""""""""""""""""""""""""""""
attemptUseVulnerabilityFromSoftwareFullAccess
"""""""""""""""""""""""""""""""""""""""""""""
useVulnerability
""""""""""""""""
attemptSpreadWormThroughRemovableMedia
""""""""""""""""""""""""""""""""""""""
successfulSpreadWormThroughRemovableMedia
"""""""""""""""""""""""""""""""""""""""""
spreadWormThroughRemovableMedia
"""""""""""""""""""""""""""""""
fullAccess
""""""""""
attemptSupplyChainAttack
""""""""""""""""""""""""
successfulSupplyChainAttack
"""""""""""""""""""""""""""
supplyChainAttack
"""""""""""""""""
bypassSupplyChainAuditing
"""""""""""""""""""""""""
supplyChainAuditingBypassed
"""""""""""""""""""""""""""
physicalAccess
""""""""""""""
attemptHardwareModifications
""""""""""""""""""""""""""""
successfulHardwareModifications
"""""""""""""""""""""""""""""""
hardwareModifications
"""""""""""""""""""""

.. _asset_hardware_hardwaremodificationsprotection:

hardwareModificationsProtection
"""""""""""""""""""""""""""""""

bypassHardwareModificationsProtection
"""""""""""""""""""""""""""""""""""""
hardwareModificationsProtectionBypassed
"""""""""""""""""""""""""""""""""""""""
attemptUnsafeUserActivity
"""""""""""""""""""""""""
successfulUnsafeUserActivity
""""""""""""""""""""""""""""
unsafeUserActivity
""""""""""""""""""
deny
""""
read
""""
modify
""""""

.. _asset_softwareproduct:

SoftwareProduct
^^^^^^^^^^^^^^^
compromiseApplications
""""""""""""""""""""""
write
"""""
readApplications
""""""""""""""""
modifyApplications
""""""""""""""""""
denyApplications
""""""""""""""""

.. _asset_application:

Application
^^^^^^^^^^^

.. _asset_application_notpresent:

notPresent
"""""""""""""""""""""""

attemptUseVulnerability
"""""""""""""""""""""""
successfulUseVulnerability
""""""""""""""""""""""""""

.. _asset_application_usevulnerability:

useVulnerability
""""""""""""""""
attemptReverseReach
"""""""""""""""""""
successfulReverseReach
""""""""""""""""""""""
reverseReach
""""""""""""
localConnect
""""""""""""
networkConnectUninspected
"""""""""""""""""""""""""
networkConnectInspected
"""""""""""""""""""""""
networkConnect
""""""""""""""
specificAccessNetworkConnect
""""""""""""""""""""""""""""
accessNetworkAndConnections
"""""""""""""""""""""""""""
attemptNetworkConnectFromResponse
"""""""""""""""""""""""""""""""""
networkConnectFromResponse
""""""""""""""""""""""""""
specificAccessFromLocalConnection
"""""""""""""""""""""""""""""""""
specificAccessFromNetworkConnection
"""""""""""""""""""""""""""""""""""

.. _asset_application_specificaccess:

specificAccess
""""""""""""""
bypassContainerization
""""""""""""""""""""""
authenticate
""""""""""""
specificAccessAuthenticate
""""""""""""""""""""""""""
localAccess
"""""""""""
networkAccess
"""""""""""""

.. _asset_application_fullaccess:

fullAccess
""""""""""
physicalAccessAchieved
""""""""""""""""""""""
attemptUnsafeUserActivity
"""""""""""""""""""""""""
successfulUnsafeUserActivity
""""""""""""""""""""""""""""

.. _asset_application_unsafeuseractivity:

unsafeUserActivity
""""""""""""""""""

attackerUnsafeUserActivityCapability
""""""""""""""""""""""""""""""""""""
attackerUnsafeUserActivityCapabilityWithReverseReach
""""""""""""""""""""""""""""""""""""""""""""""""""""
attackerUnsafeUserActivityCapabilityWithoutReverseReach
"""""""""""""""""""""""""""""""""""""""""""""""""""""""
bypassSupplyChainAuditing
"""""""""""""""""""""""""
supplyChainAuditingBypassed
"""""""""""""""""""""""""""
attemptFullAccessFromSupplyChainCompromise
""""""""""""""""""""""""""""""""""""""""""
fullAccessFromSupplyChainCompromise
"""""""""""""""""""""""""""""""""""
attemptReadFromSoftProdVulnerability
""""""""""""""""""""""""""""""""""""
attemptModifyFromSoftProdVulnerability
""""""""""""""""""""""""""""""""""""""
attemptDenyFromSoftProdVulnerability
""""""""""""""""""""""""""""""""""""
softwareProductVulnerabilityLocalAccessAchieved
"""""""""""""""""""""""""""""""""""""""""""""""
softwareProductVulnerabilityNetworkAccessAchieved
"""""""""""""""""""""""""""""""""""""""""""""""""
softwareProductVulnerabilityPhysicalAccessAchieved
""""""""""""""""""""""""""""""""""""""""""""""""""
softwareProductVulnerabilityLowPrivilegesAchieved
"""""""""""""""""""""""""""""""""""""""""""""""""
softwareProductVulnerabilityHighPrivilegesAchieved
""""""""""""""""""""""""""""""""""""""""""""""""""
softwareProductVulnerabilityUserInteractionAchieved
"""""""""""""""""""""""""""""""""""""""""""""""""""
attemptSoftwareProductAbuse
"""""""""""""""""""""""""""
softwareProductAbuse
""""""""""""""""""""
readFromSoftProdVulnerability
"""""""""""""""""""""""""""""
modifyFromSoftProdVulnerability
"""""""""""""""""""""""""""""""
denyFromSoftProdVulnerability
"""""""""""""""""""""""""""""
attemptApplicationRespondConnectThroughData
"""""""""""""""""""""""""""""""""""""""""""
successfulApplicationRespondConnectThroughData
""""""""""""""""""""""""""""""""""""""""""""""
applicationRespondConnectThroughData
""""""""""""""""""""""""""""""""""""
attemptAuthorizedApplicationRespondConnectThroughData
"""""""""""""""""""""""""""""""""""""""""""""""""""""
successfulAuthorizedApplicationRespondConnectThroughData
""""""""""""""""""""""""""""""""""""""""""""""""""""""""
authorizedApplicationRespondConnectThroughData
""""""""""""""""""""""""""""""""""""""""""""""
attemptRead
"""""""""""
successfulRead
""""""""""""""
read
""""
specificAccessRead
""""""""""""""""""
attemptModify
"""""""""""""
successfulModify
""""""""""""""""
modify
""""""
specificAccessModify
""""""""""""""""""""
attemptDeny
"""""""""""
successfulDeny
""""""""""""""
deny
""""
specificAccessDelete
""""""""""""""""""""
denyFromNetworkingAsset
"""""""""""""""""""""""
denyFromLockout
"""""""""""""""

.. _asset_idps:

IDPS
^^^^
bypassEffectiveness
"""""""""""""""""""
effectivenessBypassed
"""""""""""""""""""""
fullAccess
""""""""""
deny
""""

.. _asset_physicalzone:

PhysicalZone
^^^^^^^^^^^^
gainPhysicalAccess
""""""""""""""""""

.. _asset_network:

Network
^^^^^^^
physicalAccess
""""""""""""""
bypassEavesdropDefenseFromPhysicalAccess
""""""""""""""""""""""""""""""""""""""""
bypassAdversaryInTheMiddleDefenseFromPhysicalAccess
"""""""""""""""""""""""""""""""""""""""""""""""""""
bypassAccessControl
"""""""""""""""""""
accessControlBypassed
"""""""""""""""""""""
attemptAccessUninspected
""""""""""""""""""""""""
attemptAccessInspected
""""""""""""""""""""""
successfulAccessUninspected
"""""""""""""""""""""""""""
successfulAccessInspected
"""""""""""""""""""""""""
accessUninspected
"""""""""""""""""
accessInspected
"""""""""""""""
attemptReverseReach
"""""""""""""""""""
reverseReach
""""""""""""
networkForwardingUninspected
""""""""""""""""""""""""""""
networkForwardingInspected
""""""""""""""""""""""""""
deny
""""
accessNetworkData
"""""""""""""""""

.. _asset_network_eavesdropdefense:

eavesdropDefense
""""""""""""""""

bypassEavesdropDefense
""""""""""""""""""""""
eavesdropDefenseBypassed
""""""""""""""""""""""""
attemptEavesdrop
""""""""""""""""
successfulEavesdrop
"""""""""""""""""""
eavesdrop
"""""""""

.. _asset_network_adversaryinthemiddledefense:

adversaryInTheMiddleDefense
"""""""""""""""""""""""""""

bypassAdversaryInTheMiddleDefense
"""""""""""""""""""""""""""""""""
adversaryInTheMiddleDefenseBypassed
"""""""""""""""""""""""""""""""""""
attemptAdversaryInTheMiddle
"""""""""""""""""""""""""""
successfulAdversaryInTheMiddle
""""""""""""""""""""""""""""""
adversaryInTheMiddle
""""""""""""""""""""

.. _asset_routingfirewall:

RoutingFirewall
^^^^^^^^^^^^^^^
deny
""""
fullAccess
""""""""""

.. _asset_connectionrule:

ConnectionRule
^^^^^^^^^^^^^^

.. _asset_connectionrule_restricted:

restricted
""""""""""

.. _asset_connectionrule_payloadinspection:

payloadInspection
"""""""""""""""""

bypassRestricted
""""""""""""""""
restrictedBypassed
""""""""""""""""""
bypassPayloadInspection
"""""""""""""""""""""""
payloadInspectionBypassed
"""""""""""""""""""""""""
attemptReverseReach
"""""""""""""""""""
reverseReach
""""""""""""
attemptAccessNetworksUninspected
""""""""""""""""""""""""""""""""
attemptAccessNetworksInspected
""""""""""""""""""""""""""""""
successfulAccessNetworksUninspected
"""""""""""""""""""""""""""""""""""
successfulAccessNetworksInspected
"""""""""""""""""""""""""""""""""
accessNetworksUninspected
"""""""""""""""""""""""""
accessNetworksInspected
"""""""""""""""""""""""
attemptConnectToApplicationsUninspected
"""""""""""""""""""""""""""""""""""""""
attemptConnectToApplicationsInspected
"""""""""""""""""""""""""""""""""""""
connectToApplicationsUninspected
""""""""""""""""""""""""""""""""
connectToApplicationsInspected
""""""""""""""""""""""""""""""
attemptDeny
"""""""""""
deny
""""

.. _asset_user:

User
^^^^

.. _asset_user_nopasswordreuse:

noPasswordReuse
"""""""""""""""

.. _asset_user_noremovablemediausage:

noRemovableMediaUsage
"""""""""""""""""""""


.. _asset_user_securityawareness:

securityAwareness
"""""""""""""""""

bypassSecurityAwareness
"""""""""""""""""""""""
securityAwarenessBypassed
"""""""""""""""""""""""""
oneCredentialCompromised
""""""""""""""""""""""""
passwordReuseCompromise
"""""""""""""""""""""""
weakCredentials
"""""""""""""""
attemptSocialEngineering
""""""""""""""""""""""""
successfulSocialEngineering
"""""""""""""""""""""""""""

.. _asset_user_socialengineering:

socialEngineering
"""""""""""""""""
attemptDeliverMaliciousRemovableMedia
"""""""""""""""""""""""""""""""""""""
successfulDeliverMaliciousRemovableMedia
""""""""""""""""""""""""""""""""""""""""

.. _asset_user_delivermaliciousremovablemedia:

deliverMaliciousRemovableMedia
""""""""""""""""""""""""""""""

.. _asset_user_phishuser:

phishUser
"""""""""
credentialTheft
"""""""""""""""
attemptUnsafeUserActivity
"""""""""""""""""""""""""
successfulUnsafeUserActivity
""""""""""""""""""""""""""""

.. _asset_user_unsafeuseractivity:

unsafeUserActivity
""""""""""""""""""

.. _asset_vulnerability:

Vulnerability
^^^^^^^^^^^^^
attemptAbuse
""""""""""""
abuse
"""""
attemptExploit
""""""""""""""
exploit
"""""""
impact
""""""

.. _asset_softwarevulnerability:

SoftwareVulnerability
^^^^^^^^^^^^^^^^^^^^^

.. _asset_softwarevulnerability_notpresent:

notPresent
""""""""""

inherentUserInteraction
"""""""""""""""""""""""
networkAccessAchieved
"""""""""""""""""""""
localAccessAchieved
"""""""""""""""""""
physicalAccessAchieved
""""""""""""""""""""""
lowPrivilegesAchieved
"""""""""""""""""""""
highPrivilegesAchieved
""""""""""""""""""""""
userInteractionAchieved
"""""""""""""""""""""""
impact
""""""
read
""""
modify
""""""
deny
""""
attemptAbuse
""""""""""""
attemptExploit
""""""""""""""
exploitTrivially
""""""""""""""""
exploitWithEffort
"""""""""""""""""

.. _asset_hardwarevulnerability:

HardwareVulnerability
^^^^^^^^^^^^^^^^^^^^^
physicalAccessAchieved
""""""""""""""""""""""
impact
""""""
read
""""
modify
""""""
deny
""""
attemptExploit
""""""""""""""
exploitTrivially
""""""""""""""""
exploitWithEffort
"""""""""""""""""

