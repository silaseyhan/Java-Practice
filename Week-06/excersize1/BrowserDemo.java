package excersize1;
public class BrowserDemo {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        // STEP 1: Visit three webpages.
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.goBack();
        browser.visit("Facebook.com");
        browser.goBack();
        // STEP 3: Go forward once.
        browser.goForward();
        // STEP 4: Visit a new webpage.
        browser.visit("stackoverflow.com");
        // STEP 5: Display the current webpage.
        browser.displayCurrentPage();
        // STEP 6: Display complete browser history.
        browser.displayHistory();
    }
}