callete-template
================

Template for the callete framework.

You can execute the examples by configuring the conf/callete.properties file and run them out of your
favourite IDE. If you want to deploy your sample on a remote machine, e.g. the Raspberry Pi, just create a maven
target with profile "deploy". Also the target will fail, you will get a deployable zip archive in your
project root dir that you can unzip and run on the target machine.

When you create the deployable archive, the "callete-deployment.properties" will be used instead of the 
"callete.properties". So you can have a different configuration for your local development setup.

Check the callete page for updates:
 
https://github.com/syd711/callete
 
 