#!/bin/bash
#clean old docker
yum remove docker docker-client docker-client-latest docker-common docker-latest docker-latest-logrotate docker-logrotate docker-selinux docker-engine-selinux docker-engine

#install yum-utils
rpm -Uvh --nodeps libxml2-python-2.9.1-6.el7_2.3.x86_64.rpm
rpm -Uvh --nodeps python-chardet-2.2.1-1.el7_1.noarch.rpm
rpm -Uvh --nodeps python-kitchen-1.1.1-5.el7.noarch.rpm
rpm -Uvh --nodeps yum-utils-1.1.31-45.el7.noarch.rpm

#install device-mapper-persistent-data
rpm -Uvh --nodeps device-mapper-persistent-data-0.7.3-3.el7.x86_64.rpm

#install lvm2
rpm -Uvh --nodeps device-mapper-event-1.02.146-4.el7.x86_64.rpm 
rpm -Uvh --nodeps device-mapper-event-libs-1.02.146-4.el7.x86_64.rpm 
rpm -Uvh --nodeps device-mapper-1.02.146-4.el7.x86_64.rpm 
rpm -Uvh --nodeps device-mapper-libs-1.02.146-4.el7.x86_64.rpm 
rpm -Uvh --nodeps lvm2-libs-2.02.177-4.el7.x86_64.rpm 
rpm -Uvh --nodeps lvm2-2.02.177-4.el7.x86_64.rpm

#install docker-ce-18.03.1.ce-1.el7.centos
rpm -Uvh --nodeps audit-2.8.1-3.el7_5.1.x86_64.rpm 
rpm -Uvh --nodeps audit-libs-2.8.1-3.el7_5.1.x86_64.rpm 
rpm -Uvh --nodeps libselinux-2.5-12.el7.x86_64.rpm 
rpm -Uvh --nodeps libselinux-python-2.5-12.el7.x86_64.rpm 
rpm -Uvh --nodeps libselinux-utils-2.5-12.el7.x86_64.rpm 
rpm -Uvh --nodeps libsemanage-2.5-11.el7.x86_64.rpm 
rpm -Uvh --nodeps libsepol-2.5-8.1.el7.x86_64.rpm 
rpm -Uvh --nodeps policycoreutils-2.5-22.el7.x86_64.rpm 
rpm -Uvh --nodeps selinux-policy-3.13.1-192.el7_5.6.noarch.rpm 
rpm -Uvh --nodeps selinux-policy-targeted-3.13.1-192.el7_5.6.noarch.rpm 
rpm -Uvh --nodeps audit-libs-python-2.8.1-3.el7_5.1.x86_64.rpm 
rpm -Uvh --nodeps checkpolicy-2.5-6.el7.x86_64.rpm
rpm -Uvh --nodeps container-selinux-2.68-1.el7.noarch.rpm 
rpm -Uvh --nodeps libcgroup-0.41-15.el7.x86_64.rpm 
rpm -Uvh --nodeps libsemanage-python-2.5-11.el7.x86_64.rpm 
rpm -Uvh --nodeps pigz-2.3.3-1.el7.centos.x86_64.rpm 
rpm -Uvh --nodeps policycoreutils-python-2.5-22.el7.x86_64.rpm 
rpm -Uvh --nodeps python-IPy-0.75-6.el7.noarch.rpm 
rpm -Uvh --nodeps setools-libs-3.3.8-2.el7.x86_64.rpm 
rpm -Uvh --nodeps docker-ce-18.03.1.ce-1.el7.centos.x86_64.rpm

#start and enable docker
systemctl start docker
systemctl enable docker
