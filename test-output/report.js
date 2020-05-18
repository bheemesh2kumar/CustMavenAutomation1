$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ZomatoBookatable.feature");
formatter.feature({
  "line": 1,
  "name": "validation of bookatable module",
  "description": "",
  "id": "validation-of-bookatable-module",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user launches Zomato  application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user finds Booktable option zomato web page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on book a table page",
  "keyword": "And "
});
formatter.match({
  "location": "ZamotoStepDef.user_launches_Zomato_application()"
});
formatter.result({
  "duration": 19128856203,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.user_finds_Booktable_option_zomato_web_page()"
});
formatter.result({
  "duration": 4985009858,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.user_clicks_on_book_a_table_page()"
});
formatter.result({
  "duration": 3846994325,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "validation sort by section and its hyper link functionality",
  "description": "",
  "id": "validation-of-bookatable-module;validation-sort-by-section-and-its-hyper-link-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@booktable"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user should see Sort by lable is displayed at left on page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user should see cost category items count under categorycount",
  "rows": [
    {
      "cells": [
        "categorycount"
      ],
      "line": 17
    },
    {
      "cells": [
        "5"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "validate that if user is able to click all category items",
  "keyword": "Then "
});
formatter.match({
  "location": "ZamotoStepDef.user_should_see_Sort_by_lable_is_displayed_at_left_on_page()"
});
formatter.result({
  "duration": 295331964,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.user_should_see_cost_category_items_count_under_categorycount(DataTable)"
});
formatter.result({
  "duration": 1019639088,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.validate_that_if_user_is_able_to_click_all_category_items()"
});
formatter.result({
  "duration": 3075095939,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Validation of Zomoto Gold partner and page navigation",
  "description": "",
  "id": "validation-of-bookatable-module;validation-of-zomoto-gold-partner-and-page-navigation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@goldpartnertestcase"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "check if user can see Zomoto gold partner check box deselet by default",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks on Zomoto gold partner check box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "validate that if user can see page number\"\u003cpagenumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "validate that if user can see left angle icon disable format",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "validate that if user can see all navigation numbers show data navigationnumbers when mouseover on numbers",
  "rows": [
    {
      "cells": [
        "navigationnumbers"
      ],
      "line": 31
    },
    {
      "cells": [
        "Go to Page 1"
      ],
      "line": 32
    },
    {
      "cells": [
        "Go to Page 2"
      ],
      "line": 33
    },
    {
      "cells": [
        "Go to Page 3"
      ],
      "line": 34
    },
    {
      "cells": [
        "Go to Page 4"
      ],
      "line": 35
    },
    {
      "cells": [
        "Go to Page 5"
      ],
      "line": 36
    },
    {
      "cells": [
        "Next 5 Pages"
      ],
      "line": 37
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "validate that if user can see right angle icon enable format",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "validation-of-bookatable-module;validation-of-zomoto-gold-partner-and-page-navigation;",
  "rows": [
    {
      "cells": [
        "pagenumber"
      ],
      "line": 42,
      "id": "validation-of-bookatable-module;validation-of-zomoto-gold-partner-and-page-navigation;;1"
    },
    {
      "cells": [
        "Page 1 of 10"
      ],
      "line": 43,
      "id": "validation-of-bookatable-module;validation-of-zomoto-gold-partner-and-page-navigation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user launches Zomato  application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user finds Booktable option zomato web page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on book a table page",
  "keyword": "And "
});
formatter.match({
  "location": "ZamotoStepDef.user_launches_Zomato_application()"
});
formatter.result({
  "duration": 9174245900,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.user_finds_Booktable_option_zomato_web_page()"
});
formatter.result({
  "duration": 1245299993,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.user_clicks_on_book_a_table_page()"
});
formatter.result({
  "duration": 6173227227,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Validation of Zomoto Gold partner and page navigation",
  "description": "",
  "id": "validation-of-bookatable-module;validation-of-zomoto-gold-partner-and-page-navigation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@goldpartnertestcase"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "check if user can see Zomoto gold partner check box deselet by default",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user clicks on Zomoto gold partner check box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "validate that if user can see page number\"Page 1 of 10\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "validate that if user can see left angle icon disable format",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "validate that if user can see all navigation numbers show data navigationnumbers when mouseover on numbers",
  "rows": [
    {
      "cells": [
        "navigationnumbers"
      ],
      "line": 31
    },
    {
      "cells": [
        "Go to Page 1"
      ],
      "line": 32
    },
    {
      "cells": [
        "Go to Page 2"
      ],
      "line": 33
    },
    {
      "cells": [
        "Go to Page 3"
      ],
      "line": 34
    },
    {
      "cells": [
        "Go to Page 4"
      ],
      "line": 35
    },
    {
      "cells": [
        "Go to Page 5"
      ],
      "line": 36
    },
    {
      "cells": [
        "Next 5 Pages"
      ],
      "line": 37
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "validate that if user can see right angle icon enable format",
  "keyword": "Then "
});
formatter.match({
  "location": "ZamotoStepDef.check_if_user_can_see_Zomoto_gold_partner_check_box_deselet_by_default()"
});
formatter.result({
  "duration": 238466417,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.user_clicks_on_Zomoto_gold_partner_check_box()"
});
formatter.result({
  "duration": 5851606321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Page 1 of 10",
      "offset": 42
    }
  ],
  "location": "ZamotoStepDef.validate_that_if_user_can_see_page_number(String)"
});
formatter.result({
  "duration": 313062515,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.validate_that_if_user_can_see_left_angle_icon_disable_format()"
});
formatter.result({
  "duration": 778062253,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.validate_that_if_user_can_see_all_navigation_numbers_show_data_navigationnumbers_when_mouseover_on_numbers(DataTable)"
});
formatter.result({
  "duration": 1863904293,
  "status": "passed"
});
formatter.match({
  "location": "ZamotoStepDef.validate_that_if_user_can_see_right_angle_icon_enable_format()"
});
formatter.result({
  "duration": 1197441361,
  "status": "passed"
});
});