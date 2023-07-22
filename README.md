# Selenium-Java

How to Initialize the Webdriver after 4.6 Selenium Java

    Webdriver driver = new ChromeDriver();
    driver.get('https://www.google.com');
    driver.manage().window().maximize();

**_CSS - Selectors example_**

tag id:     # Example:    `input#small-searchterms
#small-searchterms`

tag class:     .
Example:   `input.search-box-text
.search-box-text`

tag attribute:    [ ]
Example:   `input[name='q']
    [name='q']`

tag class attribute:    .  [ ]
Example:  `input.search-box-text[name='q']
		.search-box-text[name='q']`