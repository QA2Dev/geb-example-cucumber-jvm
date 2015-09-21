package pages

import geb.Page

class GebCrossBrowserPage extends Page {
	static at = { headings[0].text() == "Cross Browser Automation" }
	static content = {
		headings(wait: true) { $('#main h1') }
		firstHeading { headings[0] }
	}
}
