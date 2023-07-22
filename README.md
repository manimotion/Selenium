# Selenium-Java

How to Initialize the Webdriver after 4.6 Selenium Java

    Webdriver driver = new ChromeDriver();
    driver.get('https://www.google.com');
    driver.manage().window().maximize();

Locators
--------
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

**Xpath**

Address of an element
DOM - Document Object Model

**2 kinds of xpaths**

1) Absolute xpath( full xpath)
  ` /html/body/header/div/div/div[1]/div/a/img`

2) Relative xpath ( partial xpath)
   `//div[@id="logo"]/a/img`

   `//img[@title='Your Store']`

How to write our own xpath?

	//*[@attribute='value']
	//tagname[@attribute='value']

Multiple attribute in xpath
`//input[@name='username'][@placeholder='Username']`
`//input[@name='username' and @placeholder='Username']`
`//input[@name='xyz' or @placeholder='Username']`


multiple attributes in xpath
* last()
* text()
* starts-with()
* contains()
* and
* or

Example: `//a[contains(text(),'pragmatic')]`
`//a[stars-with(text(),'pragmatic')]`
`//input[@value='janesh']`
`//input[@name='username' and @placeholder='Username']`

