$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("001_createTask.feature");
formatter.feature({
  "line": 1,
  "name": "Create Task",
  "description": "As a ToDo App user \r\nI should be able to create a task \r\nSo I can manage my tasks",
  "id": "create-task",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Creating a new task",
  "description": "",
  "id": "create-task;creating-a-new-task",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I has access to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to any page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should always see the My Tasks link on the NavBar",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click this link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I will be redirected to a page with all created tasks",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should see a message on the top part saying that the list belongs to me",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter a new task",
  "rows": [
    {
      "cells": [
        "Task Name"
      ],
      "line": 14
    },
    {
      "cells": [
        "taskSeleneum1"
      ],
      "line": 15
    },
    {
      "cells": [
        "t"
      ],
      "line": 16
    },
    {
      "cells": [
        "ta"
      ],
      "line": 17
    },
    {
      "cells": [
        "tas"
      ],
      "line": 18
    },
    {
      "cells": [
        ""
      ],
      "line": 19
    },
    {
      "cells": [
        "ttttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaa"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The task should be appended on the list of created tasks",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I clink on Sign out",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I am redirected to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppSteps.i_access_the_application()"
});
formatter.result({
  "duration": 21184065801,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_navigate_to_any_page()"
});
formatter.result({
  "duration": 2251273900,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_should_always_see_the_My_Tasks_link_on_the_NavBar()"
});
formatter.result({
  "duration": 16572900,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_click_this_link()"
});
formatter.result({
  "duration": 1897624600,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_will_be_redirected_to_a_page_with_all_created_tasks()"
});
formatter.result({
  "duration": 25711500,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_should_see_a_message_on_the_top_part_saying_that_the_list_belongs_to_me()"
});
formatter.result({
  "duration": 34776801,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_enter_a_new_task(DataTable)"
});
formatter.result({
  "duration": 1320001299,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat AppSteps.i_enter_a_new_task(AppSteps.java:89)\r\n\tat ✽.When I enter a new task(001_createTask.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AppSteps.the_task_should_be_appended_on_the_list_of_created_tasks()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.i_clink_on_Sign_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.i_am_redirected_to_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1961471200,
  "status": "passed"
});
formatter.uri("002_createSubtasks.feature");
formatter.feature({
  "line": 1,
  "name": "Create SubTask",
  "description": "As a ToDo App user \nI should be able to create a subtask \nSo I can break down my tasks in smaller pieces",
  "id": "create-subtask",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Creating a new subtask",
  "description": "",
  "id": "create-subtask;creating-a-new-subtask",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I has access to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I navigate to My Tasks page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see a button Manage Subtasks",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "This button should have the number of subtasks",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click this button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "A new dialog box opens up",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "It should have a read only field with the task ID",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The task description",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I add the SubTask the Description and due date",
  "rows": [
    {
      "cells": [
        "Due Date",
        "SubTask Desc"
      ],
      "line": 16
    },
    {
      "cells": [
        "01/23/2020",
        "Description"
      ],
      "line": 17
    },
    {
      "cells": [
        "2018-01-23",
        "Description"
      ],
      "line": 18
    },
    {
      "cells": [
        "2020/01/23",
        "Description"
      ],
      "line": 19
    },
    {
      "cells": [
        "2020/23/01",
        "Description"
      ],
      "line": 20
    },
    {
      "cells": [
        "23/01/2020",
        "Description"
      ],
      "line": 21
    },
    {
      "cells": [
        "01/23/2018",
        "Description"
      ],
      "line": 22
    },
    {
      "cells": [
        "",
        "Description"
      ],
      "line": 23
    },
    {
      "cells": [
        "test123",
        "Description"
      ],
      "line": 24
    },
    {
      "cells": [
        "00/00/0000",
        "Description"
      ],
      "line": 25
    },
    {
      "cells": [
        "01/23/2020",
        ""
      ],
      "line": 26
    },
    {
      "cells": [
        "01/23/2020",
        "Description"
      ],
      "line": 27
    },
    {
      "cells": [
        "01/23/2020",
        "Description"
      ],
      "line": 28
    },
    {
      "cells": [
        "01/23/2020",
        "Description"
      ],
      "line": 29
    },
    {
      "cells": [
        "01/23/2020",
        "Description"
      ],
      "line": 30
    },
    {
      "cells": [
        "01/23/2020",
        "ttttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaattttttttttaaaaaaaaaa"
      ],
      "line": 31
    },
    {
      "cells": [
        "01/23/2020",
        "Description"
      ],
      "line": 32
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "The subtask should be appended on the bottom of the box",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I clink on Sign out",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I am redirected to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppSteps.i_access_the_application()"
});
formatter.result({
  "duration": 18035558200,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_navigate_to_My_Tasks_page()"
});
formatter.result({
  "duration": 1697024000,
  "status": "passed"
});
formatter.match({
  "location": "AppSteps.i_should_see_a_button_Manage_Subtasks()"
});
formatter.result({
  "duration": 23850000,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: tr:nth-child(1) \u003e td:nth-child(4) \u003e button\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027DESKTOP-UJI8L8D\u0027, ip: \u0027192.168.0.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 64.0.2, javascriptEnabled: true, moz:accessibilityChecks: false, moz:geckodriverVersion: 0.23.0, moz:headless: false, moz:processID: 5352, moz:profile: C:\\Users\\Douglas\\AppData\\Lo..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, rotatable: false, setWindowRect: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 905a20be-dbe4-47dd-9768-5c94b7cb3df5\n*** Element info: {Using\u003dcss selector, value\u003dtr:nth-child(1) \u003e td:nth-child(4) \u003e button}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat PageObject$MyTasksPage.manageSubtasks(PageObject.java:104)\r\n\tat AppSteps.i_should_see_a_button_Manage_Subtasks(AppSteps.java:141)\r\n\tat ✽.Then I should see a button Manage Subtasks(002_createSubtasks.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AppSteps.this_button_should_have_the_number_of_subtasks()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.i_click_this_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.a_new_dialog_box_opens_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.it_should_have_a_read_only_field_with_the_task_ID()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.the_task_description()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.i_add_the_SubTask_Description_and_due_date(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.the_subtask_should_be_appended_on_the_bottom_of_the_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.i_clink_on_Sign_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppSteps.i_am_redirected_to_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1962041500,
  "status": "passed"
});
});