UML EDITOR
====================================

Features
===============

* easy registration of new user
* stores passwords in DB as hashes
* uml to xmi export 
* save the uml as image
* modern and minimalistic design
* easy logout with session destroy
* designed for security

Hosting the site
=====================

To host the site use Xampp which uses mysql, tomcat and apache servers and proceed by hosting with localhost. Wampp won't support to host the site since servlets have been used.

Connect with DB
=====================

Import the db file into localhost mysql which is used to store the login credintials and the uml diagrams which was done by the user.

Install Images
===============

Update the db.php File Details as shown Below:

<a href="https://i.imgur.com/YK3mpAM.jpg" target="_blank"><img style="padding-left:5%;" src="https://i.imgur.com/YK3mpAM.jpg" alt="Login/Register Form Install Instructions" width="100%"></img></a>

Making a secure Page
=====================

To make a secure page add the contents from "auth.php" to the top of any .php page. This will force the user to login before they can see your page.


UML Compoonents
=====================

* Class
* Interface
* Attributes
* Abstract Class
* Association
* Composition
* Generalization

XMI Export
=====================

To export the uml click XMI Export and it will download the .xmi file. This allows the user to store and retireve the data at any time offline


Save the UML as image
=====================

The UML diagram can be exported in the form of jpg by clicking on the Save as Image button at the footer of the uml.html page. Servlets have been implemented to perform the action.
  
Preview
========
Login Form: https://github.nated.xyz/demo/login-signup-form/login.php


License
==========
This software is under an MIT License. Which allows full use to edit, distribute, or sell this code.
See the "LICENSE" file for more information!
