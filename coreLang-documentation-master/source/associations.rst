Associations
============

.. contents::
   :depth: 2
   :local:

.. _association_encryptioncredentials:

Credentials <-- EncryptionCredentials --> Data
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_signingcredentials:

Credentials <-- SigningCredentials --> Data
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_hashedcredentials:

Credentials <-- HashedCredentials --> Credentials
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_conditionalauthentication:

Credentials <-- ConditionalAuthentication --> Credentials
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_identitycredentials:

Identity <-- IdentityCredentials --> Credentials
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_canassume:

Identity <-- CanAssume --> Identity
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_memberof_identity:

Group <-- MemberOf --> Identity
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_memberof_group:

Group <-- MemberOf --> Group
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_executionprivilegeaccess:

IAMObject <-- ExecutionPrivilegeAccess --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_highprivilegeapplicationaccess:

IAMObject <-- HighPrivilegeApplicationAccess --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_lowprivilegeapplicationaccess:

IAMObject <-- LowPrivilegeApplicationAccess --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_readprivileges:

IAMObject <-- ReadPrivileges --> Data
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_writeprivileges:

IAMObject <-- WritePrivileges --> Data
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_deleteprivileges:

IAMObject <-- DeletePrivileges --> Data
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_hasprivileges:

IAMObject <-- HasPrivileges --> Privileges
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_accountmanagement:

IAMObject <-- AccountManagement --> IAMObject
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_datacontainment:

Data <-- DataContainment --> Data
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_appcontainment:

Data <-- AppContainment --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_senddata:

Data <-- SendData --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_receivedata:

Data <-- ReceiveData --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_dataintransit:

Data <-- DataInTransit --> Network
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_datahosting:

Data <-- DataHosting --> Hardware
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_infocontainment:

Data <-- InfoContainment --> Information
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_replica:

Data <-- Replica --> Information
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_data_dependence:

Data <-- Dependence --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_information_dependence:

Information <-- Dependence --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_sysexecution:

Hardware <-- SysExecution --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_appexecution:

Application <-- AppExecution --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_appprotection:

IDPS <-- AppProtection --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_appsoftwareproduct:

SoftwareProduct <-- AppSoftwareProduct --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_zoneinclusion_hardware:

PhysicalZone <-- ZoneInclusion --> Hardware
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_zoneinclusion_network:

PhysicalZone <-- ZoneInclusion --> Network
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_connectionrule:

RoutingFirewall <-- ConnectionRule --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_managedby:

RoutingFirewall <-- ManagedBy --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_networkexposure:

Network <-- NetworkExposure --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_applicationconnection:

Application <-- ApplicationConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_inapplicationconnection:

Application <-- InApplicationConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_outapplicationconnection:

Application <-- OutApplicationConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_networkconnection:

Network <-- NetworkConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_innetworkconnection:

Network <-- InNetworkConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_outnetworkconnection:

Network <-- OutNetworkConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_dionenetworkconnection:

Network <-- DiodeInNetworkConnection --> ConnectionRule
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_zoneaccess:

User <-- ZoneAccess --> PhysicalZone
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_hardwareaccess:

User <-- HardwareAccess --> Hardware
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_userassignedindentities:

User <-- UserAssignedIdentities --> Identity
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_applicationvulnerability_application:

SoftwareVulnerability <-- ApplicationVulnerability --> Application
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_applicationvulnerability_softwareproduct:

SoftwareVulnerability <-- ApplicationVulnerability --> SoftwareProduct
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _association_hardwarevulnerability:

HardwareVulnerability <-- hardwareVulnerability --> Hardware
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
