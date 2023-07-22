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

1) get methods
2) conditional methods
3) Browser methods
4) Navigational methods
5) wait methods

get methods  - we can these methods through webdriver instance
* get(url)
* getTitle()
* getCurrentURL()
* getPageSource()
* getWindowHandle()
* getwindowHandles()

conditional commands - access these commands thorugh WebElement

Returns true/false ( boolean values)

* isDisplayed()
* isEnabled()
* isSelected()


browser methods

* close() - close single browser window
* quit()

wait commands
----

wait statements will be used to solve synchronization problem in automation.


Thread.sleep(ms)

implicit wait
explicite wait/ fluent state

sleep() : provided by java itself( not selenium command)
------------
Adv:
1) easy to use

DisAdvantage:

1) if the time is not suffitient then you will get exception
2) it will wait ofr maximum time out. this will reduce the perforemce script.
3) multiple times

implicit wait
----------
Adv:
1) single time/one statement
2) it will not wait till maximum time if the element is availble
3) Applicable for all the elements
4) easy to use

Disadvantge:
1) if the time is not suffitient then you will get exception

Explicit wait
------------
declartion
usage

1) Conditional based, it will work more effectively.
2) finding element is inclusive
3) it will wait for copndition to be true, the consider the time
4) we need to write multiple statements for multiple elements


Fluent wait
------
// Waiting 30 seconds for an element to be present on the page, checking
// for its presence once every 5 seconds.

Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30L))
.pollingEvery(Duration.ofSeconds(5L))
.ignoring(NoSuchElementException.class);


WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
public WebElement apply(WebDriver driver) {
return driver.findElement(By.id("foo"));
}
});


Navigational commands
-----------------
navigate().to(url)   same as driver.get(url)
navigate().forward()
navigate().back()
navigate().refresh()

driver.navigate().to(url);

driver.manage().window().maximize();

"https://www.google.com"   -----> string

URL myurl=new URL("https://www.google.com")

navigate().to(URL)
accepts url is URL & Strign format

driver.get()  
accepts only String format