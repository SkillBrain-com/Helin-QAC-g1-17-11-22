The test site https://katalon-demo-cura.herokuapp.com/ will be used.

    1. A test framework will be created, which will create a driver before each test method. 
    The driver will initialize itself in a separate class. 
    Configurations for tests will be done in a dedicated class that will be inherited by the test classes.

    2. Automated tests will be created on this framework to cover the following scenarios:

        2.1. Login from the menu in the upper right corner, with a valid user
        2.2. Login from the menu in the upper right corner, with an invalid user
        2.3. The Make Appointment button will redirect the user to the login step, 
             if he is not logged in when he clicks the button
        2.4. Different positive and negative booking scenarios will be tested
            (at least 1 positive scenario and one negative scenario)
        2.5. The Home button in the upper right menu always takes the user to the homepage, 
             regardless of which page he clicks on
        2.6. Verified that the user can make an appintment for the past date
    3. Upload the project to Github and upload a link to the repository to the platform.