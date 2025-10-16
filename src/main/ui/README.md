Why under /WEB-INF/views/?

This is a security convention — files under WEB-INF can’t be accessed directly from the browser.
So users can’t go to localhost:8080/views/home.jsp directly.