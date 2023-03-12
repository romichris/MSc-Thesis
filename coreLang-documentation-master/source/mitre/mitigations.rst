Mitigations
-----------

.. contents::
    :depth: 2
    :local:

.. _mitre_account_use_policies:

M1036 	Account Use Policies
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1036/>`__

This mitigation is not covered by the language. We do model the :ref:`lockout
<asset_identity_lockout>` from account aspect mentioned, but only if the
attacker is able to deny all of the :ref:`asset_credentials` :ref:`associated
<association_identitycredentials>` associated with an :ref:`asset_identity`.
Location and device restrictions on logins are beyond the scope of the
language.

.. _mitre_active_directory_configuration:

M1015 	Active Directory Configuration
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1015/>`__

Generally, this is too implementation specific for coreLang. However, we can
represent many of the concepts in a high-level fashion through :ref:`IAM
<asset_iamobject>` assets, such as :ref:`asset_identity`, :ref:`asset_group`,
and :ref:`asset_privileges`. The :ref:`asset_iamobject_notpresent` defense on
these assets can be used to reason about restricting certain permissions or
roles.

.. _mitre_antivirus_antimalware:

M1049 	Antivirus/Antimalware
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1049/>`__

Antivirus or antimalware tools are explicitly represented in the language by
the :ref:`asset_idps` asset that is used to :ref:`safeguard
<association_appprotection>` :ref:`applications <asset_application>` from
:ref:`software vulnerabilities <asset_softwarevulnerability>` and :ref:`unsafe
user activity <asset_application_unsafeuseractivity>` that was induced by the
attacker through :ref:`social engineering <asset_user_socialengineering>`.

.. _mitre_application_developer_guidance:

M1013 	Application Developer Guidance
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1013/>`__

This is not generally covered by the language as it is both too implementation
specific and occurs outside of the actual attack timeline. However, the
:ref:`asset_softwarevulnerability_notpresent` defense on
:ref:`asset_softwarevulnerability` can be used to reason about restricting
particular vulnerabilities in :ref:`software products <asset_softwareproduct>`
or :ref:`applications <asset_application>`. The guidance that has to deal with
principle of least privilege can be represented via the
:ref:`asset_iamobject_notpresent` defense on :ref:`IAM <asset_iamobject>`
assets.

.. _mitre_application_isolation_and_sanboxing:

M1048 	Application Isolation and Sandboxing
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1048/>`__

:ref:`Applications <asset_application>` can :ref:`host
<association_appexecution>` other :ref:`Applications <asset_application>` in
coreLang and this association represents any type of containerization,
sandboxing, or isolation. If the attacker gains :ref:`full access
<asset_application_fullaccess>` to the
container they can attempt to connect to the host :ref:`asset_application` since
they are assumed to be able to bypass some of the sandboxing mechanisms.
However, they are still somewhat restricted and cannot perform any other
actions unless they have some :ref:`privileges <asset_iamobject>` on the host
or are able to exploit a :ref:`vulnerability <asset_softwarevulnerability>`.
If the attacker gets :ref:`low privilege access
<asset_application_specificaccess>` on the container the language still
assumes that there might be convoluted situations where with considerable
effort they can break the containerization and connect to the host
application, but these are very unlikely.

.. _mitre_audit:

M1047 	Audit
^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1047/>`__

The Audit mitigation does not have a straightforward equivalent in
coreLang, since it is very specific to the various techniques it applies to.
Generally, this mitigation suggests regular reviews looking for artifacts that
indicate an attacker's actions. It is generally covered by :ref:`asset_idps`
asset and attack steps which require additional effort to succeed, the
implication being that the attacker needs to invest additional time to succeed
in order to avoid detection.

.. _mitre_behavior_prevention_on_endpoint:

M1040 	Behavior Prevention on Endpoint
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1040/>`__

Behavior Prevention on Endpoint from coreLang's perspective is very similar to
the :ref:`mitre_antivirus_antimalware` mitigation, and can usually be modeled
the same way. If a technique or scenario suggests that one of these
mitigations should be more narrowly focused on a particular exploit avenue
then the :ref:`asset_softwarevulnerability_notpresent` defense on the
:ref:`asset_softwarevulnerability` representing the vulnerable feature could
also be used as a more precise way of restricting certain attack vectors.

.. _mitre_boot_integrity:

M1046 	Boot Integrity
^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1046/>`__

Many of the techniques that suggest this mitigation could use the same
mechanisms that were described for :ref:`mitre_code_signing`, with the binary
:ref:`asset_data` representing the system, BIOS, or EFI image and the
:ref:`asset_application` being the operating system or firmware.

If the boot integrity check is done by specialized hardware the
:ref:`asset_hardware_hardwaremodificationsprotection` defense on the
:ref:`asset_hardware` asset can be used to represent the boot integrity check.


.. _mitre_code_signing:

M1045 	Code Signing
^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1045/>`__


The :ref:`Signing Credentials <association_signingcredentials>` association
between :ref:`asset_credentials` and :ref:`asset_data` can be used to
represent signing of any type of :ref:`asset_data`. The signed
:ref:`asset_data` cannot be :ref:`overwritten <asset_data_write>` by the
attacker unless they were able to compromise the signing
:ref:`asset_credentials`.

Often this signing mitigation is suggested for release binaries or source
code. For these situations the :ref:`asset_data` can then be specified as
:ref:`containing <association_infocontainment>` a :ref:`asset_softwareproduct`
designated as the :ref:`software package <association_appsoftwareproduct>`
used by one or more :ref:`Applications <asset_application>`.

If the :ref:`asset_data` being signed do not represent a software package in
binary or source code form they can be specified as a :ref:`dependence
<association_data_dependence>` for the :ref:`asset_application` instead.

.. _mitre_credential_access_protection:

M1043 	Credential Access Protection
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1043/>`__

There are two separate facets that this mitigation entails. First,
restricting the security context in which certain drivers are executed to
limit the impacts of successful attacker exploitation. This behavior is very
similar to the other mitigations that deal with the least privilege principle,
such as :ref:`mitre_privileged_account_management` and
:ref:`mitre_restrict_registry_permissions`. Second, making sure that password
storing is encrypted, which is very similar to
:ref:`mitre_encrypt_sensitive_information`.

.. _mitre_data_backup:

M1053 	Data Backup
^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1053/>`__

The :ref:`Replica <association_replica>` association between
:ref:`asset_information` and :ref:`asset_data` was specifically introduced
during the validation process to implement this mitigation. An attacker that
is able to :ref:`asset_data_read` a replica is granted :ref:`asset_data_read`
on all other replicas since they contain the same information. However, for
the :ref:`asset_information` to suffer a :ref:`asset_information_write`,
:ref:`asset_information_delete`, or :ref:`asset_information_deny` all of its
replicas need to have been impacted by :ref:`asset_data_write`,
:ref:`asset_data_delete`, or :ref:`asset_data_deny`, respectively. The
language assumes that any of the replicas can be used to recover the
information. This means that it does not cover more intricate scenarios, such
as gradual poisoning of the backups or exploiting voting system mechanisms.

.. _mitre_data_loss_prevention:

M1057 	Data Loss Prevention
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1057/>`__

This mitigation comprises of two separate components. First, restricting
access to the data is functionally similar to
:ref:`mitre_restrict_file_and_directory_permissions`.  Second, restricting the
ability of the attacker to exfiltrate the data if they have accessed it is
covered by the :ref:`asset_connectionrule_payloadinspection` defense on
the :ref:`asset_connectionrule` asset as detailed in the
:ref:`mitre_network_intrusion_prevention` mitigation.

These two aspects match how exfiltration requires both access and network
connectivity as discussed in :ref:`mitre_tactic_exfiltration`.

.. _mitre_disable_or_remove_feature_or_program:

M1042 	Disable or Remove Feature or Program
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1042/>`__

This is more of a structural mitigation, but the
:ref:`asset_application_notpresent` defense on :ref:`asset_application` is an
explicit way to reason about it.

.. _mitre_do_not_mitigate:

M1055 	Do Not Mitigate
^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1055/>`__

Not covered by the language as it is an indication of when not to apply other
mitigations.

.. _mitre_encrypt_sensitive_information:

M1041 	Encrypt Sensitive Information
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1041/>`__

This can be represent in coreLang by using :ref:`asset_credentials` to
:ref:`encrypt <association_encryptioncredentials>` the relevant
:ref:`asset_data`. The encrypted :ref:`asset_data` cannot be  :ref:`read
<asset_data_read>`, :ref:`overwritten <asset_data_write>`, :ref:`deleted
<asset_data_delete>` by the attacker unless they were able to compromise the
encryption :ref:`asset_credentials`.  However, the :ref:`asset_data` can still
be :ref:`denied <asset_data_deny>`.

.. _mitre_environment_variable_permissions:

M1039 	Environment Variable Permissions
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1039/>`__

This mitigation is just a more specific application of
:ref:`mitre_restrict_file_and_directory_permissions`. If the environment
variables can be used to hijack the execution of an :ref:`asset_application`
the :ref:`asset_data` representing them can be defined as a :ref:`dependence
<association_data_dependence>` for it.

.. _mitre_execution_prevention:

M1038 	Execution Prevention
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1038/>`__

A large number of facets are encompassed by this mitigation, as the name
would imply. Any mechanism that could restrict the ability of the attacker to
gain execution is included. As such, these have already been covered in other
mitigations, for example :ref:`mitre_code_signing`,
:ref:`mitre_antivirus_antimalware`,
:ref:`mitre_disable_or_remove_feature_or_program`, and
:ref:`mitre_restrict_file_and_directory_permissions`.

.. _mitre_exploit_protection:

M1050 	Exploit Protection
^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1050/>`__

From coreLang's perspective this is functionally identical to
:ref:`mitre_antivirus_antimalware`.

.. _mitre_filter_network_traffic:

M1037 	Filter Network Traffic
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1037/>`__

Protocol-based traffic filtering is implemented in coreLang by using the
:ref:`asset_connectionrule_restricted` defense on :ref:`asset_connectionrule`
or by changing the model structure and removing :ref:`ConnectionRules
<asset_connectionrule>`.  The :ref:`asset_connectionrule_restricted` defense
stops all traffic through the asset. This makes the
:ref:`asset_connectionrule` behave as if it were not present in the model,
which is in line with the structural approach of simply removing the asset.
However, :ref:`asset_connectionrule_restricted` is assumed to be imperfect and
that the attacker may find ways to bypass the filtering with substantial
effort.

.. _mitre_limit_access_to_resource_over_network:

M1035 	Limit Access to Resource Over Network
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1035/>`__

Many of the implementations suggested by this mitigation have to do with
restricting particular connections based on certain protocols, ports, or
configurations. All of these can be implemented using the same mechanisms that
were mentioned for :ref:`mitre_filter_network_traffic`. The scenarios
where remote desktop gateways or virtual private networks are suggested can
utilise an :ref:`asset_identity` and :ref:`asset_credentials` :ref:`pair
<association_identitycredentials>`. Where the :ref:`asset_identity` represents
the security context on the :ref:`asset_application` endpoints of the
communication and the :ref:`asset_credentials` represent the keys used to
authenticate and encrypt :ref:`asset_data` traversing the tunnel.

.. _mitre_limit_hardware_installation:

M1034 	Limit Hardware Installation
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1034/>`__

The :ref:`asset_hardware_hardwaremodificationsprotection` defense on the
:ref:`asset_hardware` asset prevents unsafe user actions on the hardware
system.

.. _mitre_limit_software_installation:

M1033 	Limit Software Installation
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1033/>`__

Due to the fact that the attacker cannot introduce new assets into the model
as a result of triggering attack steps software installation is generally not
covered by the language. However, the suggestions for
:ref:`mitre_disable_or_remove_feature_or_program` are applicable to this
mitigation as well, as they are alike.

.. _mitre_multi_factor_authentication:

M1032 	Multi-factor Authentication
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1032/>`__

The :ref:`Conditional Authentication <association_conditionalauthentication>`
association between :ref:`asset_credentials` is used to
represent multi-factor authentication in coreLang. This protects the primary
:ref:`asset_credentials` from being compromised unless the additional factors
specified have also been compromised by the attacker. This association can be
nested and multiple required factors can be specified for the same
:ref:`asset_credentials`.

Furthermore, three defenses on the :ref:`asset_credentials` asset exist that
allow the modeler to define its characteristics,
:ref:`asset_credentials_notguessable`, :ref:`asset_credentials_unique`, and
:ref:`asset_credentials_notphishable`. These allow :ref:`asset_credentials` to
represent a variety of authentication mechanisms, from biometrics to one-time
passwords.


.. _mitre_network_intrusion_prevention:

M1031 	Network Intrusion Prevention
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1031/>`__

Payload based filtering in coreLang is implemented via the
:ref:`asset_connectionrule_payloadinspection` defense on the
:ref:`asset_connectionrule` asset. This defense prevents the attacker from
being able to :ref:`exploit vulnerabilities
<asset_application_usevulnerability>` or :ref:`induce unsafe user
actions <asset_application_unsafeuseractivity>` on the
:ref:`Applications <asset_application>` they reach via inspected
:ref:`Connection Rules <asset_connectionrule>`, as the payload inspection is
expected to detect the anomalous patterns and filter the traffic out. However,
the adversary would still be able to utilize legitimate
:ref:`asset_credentials` to authenticate since these would not stand out as
atypical.

The :ref:`asset_network_adversaryinthemiddledefense` defense on the
:ref:`asset_network` asset can also be used to protect :ref:`asset_data` that
:ref:`transit <association_dataintransit>` the :ref:`asset_network` from
:ref:`mitre_technique_adversary_in_the_middle` attacks.

.. _mitre_network_segmentation:

M1030 	Network Segmentation
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1030/>`__

From coreLang's viewpoint this mitigation is equivalent to
:ref:`mitre_filter_network_traffic`.

.. _mitre_operating_system_configuration:

M1028 	Operating System Configuration
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1028/>`__

This is a more specific application of the same mechanisms described for
:ref:`mitre_software_configuration`.

This mitigation defines a specific place, the operating system, where security
improvements can be made. From coreLang's perspective the operating system is
simply an :ref:`asset_application`. Usually, it will host other
:ref:`Applications <asset_application>` :ref:`running on
<association_appexecution>` it and sometimes the :ref:`asset_hardware` it
:ref:`runs on <association_sysexecution>` will also be represented.

.. _mitre_password_policies:

M1027 	Password Policies
^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1027/>`__

In addition to the :ref:`asset_credentials_notguessable`, :ref:`asset_credentials_unique`, and
:ref:`asset_credentials_notphishable` defenses on :ref:`asset_credentials`
already mentioned by :ref:`mitre_multi_factor_authentication`, the language
also makes assumptions regarding the password strength based on the
:ref:`asset_user`'s :ref:`security awareness <asset_user_securityawareness>`.

If a :ref:`asset_credentials` asset is guessable(it does not have the
:ref:`asset_credentials_notguessable` defense enabled) and it has an
:ref:`asset_identity` :ref:`associated <association_identitycredentials>` with
it, which in turn has a :ref:`asset_user` :ref:`associated
<association_userassignedindentities>` with it, the :ref:`security awareness
<asset_user_securityawareness>` of that :ref:`asset_user` will determine how
easy it is to guess the :ref:`asset_credentials`.

.. _mitre_pre_compromise:

M1056 	Pre-compromise
^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1056/>`__

The aspects of the attack before the actual compromise are beyond the scope of
coreLang.

.. _mitre_privileged_account_management:

M1026 	Privileged Account Management
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1026/>`__

Privileged Account Management is a more targeted instance of
:ref:`mitre_user_account_management`, it places the emphasis on the access
control roles that are very impactful, such as SYSTEM and root.


.. _mitre_privileged_process_integrity:

M1025 	Privileged Process Integrity
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1025/>`__

This mitigation highlights the importance of protecting software processes,
mentioned in :ref:`mitre_execution_prevention`, with a particular emphasis on
the :ref:`mitre_code_signing` aspects for Windows systems, for elevated
privileges processes.

In coreLang a privileged process would be one which is executed in an elevated
security context, represented by one of the :ref:`IAM <asset_iamobject>`
assets(:ref:`asset_identity`, :ref:`asset_group`, or :ref:`asset_privileges`)
with :ref:`Execution Privileges Access <association_executionprivilegeaccess>`
on the :ref:`asset_application` depicting the process, that also has
:ref:`Execution Privileges Access <association_executionprivilegeaccess>` or
:ref:`High Privileges Access <association_highprivilegeapplicationaccess>` on
other :ref:`Applications <asset_application>`.

.. _mitre_remote_data_storage:

M1029 	Remote Data Storage
^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1029/>`__

Much of this technique has to do with structural improvements where the
:ref:`asset_data` the attacker is seeking to attain are not present on systems
that are deemed more vulnerable. Other aspects are creating backups, covered
by :ref:`mitre_data_backup`, and encrypting sensitive data, discussed in
:ref:`mitre_encrypt_sensitive_information`.

.. _mitre_restrict_file_and_directory_permissions:

M1022 	Restrict File and Directory Permissions
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1022/>`__

:ref:`Read <association_readprivileges>`, :ref:`Write
<association_writeprivileges>`, and :ref:`Delete
<association_deleteprivileges>` privileges can be defined for :ref:`IAM
<asset_iamobject>` assets(:ref:`asset_identity`, :ref:`asset_group`, or
:ref:`asset_privileges`) to designate their permissions on :ref:`asset_data`,
which is how files and directories are represented in coreLang.

This mitigation suggests structural changes to the models by removing
extraneous privileges. The :ref:`asset_iamobject_notpresent` defense on the
:ref:`IAM <asset_iamobject>` assets can be used to speculate about the attack
vectors that removing these permission would thwart. :ref:`asset_privileges`
are a good candidate for modeling these scenarios since they can be
associated with either an :ref:`asset_identity` or a :ref:`asset_group` as
:ref:`Subprivileges <association_hasprivileges>` to represent that those
:ref:`asset_privileges` act as a subset of permissions available to those
roles. Therefore the unnecessary permissions can be represented as
:ref:`Subprivileges <association_hasprivileges>` of the :ref:`asset_identity`
or :ref:`asset_group`.

.. _mitre_restrict_library_loading:

M1044 	Restrict Library Loading
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1044/>`__

From coreLang's viewpoint this is a more specific example of
:ref:`mitre_exploit_protection`.

.. _mitre_restrict_registry_permissions:

M1024 	Restrict Registry Permissions
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1024/>`__

This is similar to :ref:`mitre_environment_variable_permissions`.

.. _mitre_restrict_web_based_content:

M1021 	Restrict Web-Based Content
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1021/>`__

Most of the restrictions suggested are applied on the host side, which would
match :ref:`mitre_exploit_protection`.

.. _mitre_software_configuration:

M1054 	Software Configuration
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1054/>`__

Most of the implementations suggested by this mitigation for various
techniques are covered by other mitigations, they are just usually part of
software configurations. See
:ref:`mitre_exploit_protection`,
:ref:`mitre_disable_or_remove_feature_or_program`,
:ref:`mitre_limit_hardware_installation`, :ref:`mitre_code_signing`,
:ref:`mitre_privileged_account_management`, and
:ref:`mitre_restrict_file_and_directory_permissions`.


.. _mitre_ssl_tls_inspection:

M1020 	SSL/TLS Inspection
^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1020/>`__

This is not possible in coreLang. If the :ref:`Connection
Rule<asset_connectionrule>`'s :ref:`Payload
Inspection<asset_connectionrule_payloadinspection>` defense is bypassed due
:ref:`encrypted <association_encryptioncredentials>` :ref:`asset_data`
traversing the :ref:`asset_connectionrule` there is no mechanism through which
the inspection can be restored.

.. _mitre_threat_intelligence_program:

M1019 	Threat Intelligence Program
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1019/>`__

The aspects described are beyond the scope of coreLang modeling.

.. _mitre_update_software:

M1051 	Update Software
^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1051/>`__

This can be represented in the same way as the
:ref:`mitre_exploit_protection`.

.. _mitre_user_account_control:

M1052 	User Account Control
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1052/>`__

This mitigation has to do with the configuration of the Windows User Access
Control feature to reduce the risks of privilege escalation. It can be
implemented by removing, or enabling the
:ref:`asset_softwarevulnerability_notpresent` defense on, the
:ref:`asset_softwarevulnerability` described in the
:ref:`mitre_technique_exploitation_for_privilege_escalation` technique.

.. _mitre_user_account_management:

M1018 	User Account Management
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1018/>`__

This mitigation is analogous to
:ref:`mitre_restrict_file_and_directory_permissions`. 

:ref:`Execution <association_executionprivilegeaccess>`, :ref:`High
<association_highprivilegeapplicationaccess>`, and :ref:`Low
<association_lowprivilegeapplicationaccess>` privileges can be defined for
:ref:`IAM <asset_iamobject>` assets(:ref:`asset_identity`, :ref:`asset_group`,
or :ref:`asset_privileges`) to designate their permissions for
:ref:`Applications <asset_application>`.

:ref:`IAM <asset_iamobject>` assets can also be granted :ref:`management
<association_accountmanagement>` privileges on other :ref:`IAM
<asset_iamobject>` assets.

This mitigation suggests structural changes to the models by removing
extraneous privileges. The :ref:`asset_iamobject_notpresent` defense on the
:ref:`IAM <asset_iamobject>` assets can be used to speculate about the attack
vectors that removing these permissions would thwart. :ref:`asset_privileges`
are a good candidate for modeling these scenarios since they can be
associated with either an :ref:`asset_identity` or a :ref:`asset_group` as
:ref:`Subprivileges <association_hasprivileges>` to represent that those
:ref:`asset_privileges` act as a subset of permissions available to those
roles. Therefore the unnecessary permissions can be represented as
:ref:`Subprivileges <association_hasprivileges>` of the :ref:`asset_identity`
or :ref:`asset_group`.

.. _mitre_user_training:

M1017 	User Training
^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1017/>`__

The principle way to represent this technique in coreLang is the
:ref:`Security Awareness<asset_user_securityawareness>` defense on the
:ref:`asset_user`. This defense prevents a variety of disruptions enabled by
:ref:`Social Engineering <asset_user_socialengineering>`, such as
:ref:`phishing the user <asset_user_phishuser>` for :ref:`asset_credentials`
or tricking them into performing :ref:`unsafe user actions
<asset_user_unsafeuseractivity>` on :ref:`Applications <asset_application>`.

Additionally, two separate more specialized defenses, also exist on the
:ref:`asset_user`. :ref:`No Passoward Reuse <asset_user_nopasswordreuse>`
specifies if a particular :ref:`asset_user` will use the same
:ref:`asset_credentials` for multiple purposes. :ref:`No Removable Media
Usage <asset_user_noremovablemediausage>` defines if a :ref:`asset_user` will
spread attacks that :ref:`propagate through removable media
drives<asset_user_delivermaliciousremovablemedia>`.


.. _mitre_vulnerability_scanning:

M1016 	Vulnerability Scanning
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

`Mitre Description <https://attack.mitre.org/mitigations/M1016/>`__

This can be represented in the same way as the
:ref:`mitre_exploit_protection`.

