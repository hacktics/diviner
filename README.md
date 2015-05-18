<font size="5"><b>Diviner - Clairvoyance in the Digital Frontier</b></font><br><br>
Diviner is an <u>active</u> information gathering platform, built as an extension for <a href="http://code.google.com/p/zaproxy/" target="_blank">OWASP Zed Attack Proxy (ZAP)</a>,<br>
and aimed to enhance the tester’s decision making process.<br>

Developed by <a href="http://www.hacktics.com" target="_blank">Hacktics ASC</a><br>
<a href="http://www.hacktics.com" target="_blank"><img src="http://diviner.googlecode.com/files/hacktics_logo.jpg" /></a><br>
Diviner is a unique platform that attempts to <b>predict</b> the structure of the <b>server-side memory, source code and processes,</b><br>
by executing scenarios aimed to fingerprint <b>behaviors that derive from specific lines of code, processes or memory allocations</b>, <br>
by employing the use of a variety of coverage processes, content differentiation tests and entry point execution scenarios, <br>
and by using deduction algorithms that convert this information into a visual map of the application.<br>

The information is also presented in the form of <b>leads</b>, that can help testers locate complex vulnerabilities, <br>
the same way they locate vulnerabilities that are considered low hanging fruit.<br>

<b>Requirements:</b>
<LI> Diviner requires Java <u>1.7.x</u> (it will <b>not</b> work with previous java versions), and was tested with ZAP v2.0/1.4.0.1/1.4.1.
<LI> Verify that ZAP proxy is executed using Java 1.7.x, prior to running the installer.
<br>

<a href="http://diviner.googlecode.com/files/diviner-poc-server-memory-divination-and-leads-for-cross-page-attacks.png" target="_blank">
<img src="http://diviner.googlecode.com/files/diviner-poc-server-memory-divination-and-leads-for-cross-page-attacks.png" width="200" height="150"/>
</a><a href="http://diviner.googlecode.com/files/diviner-poc-server-memory-divination-and-leads-for-cross-page-peristent-attacks.png" target="_blank">
<img src="http://diviner.googlecode.com/files/diviner-poc-server-memory-divination-and-leads-for-cross-page-peristent-attacks.png" width="200" height="150"/>
</a><a href="http://diviner.googlecode.com/files/diviner-poc-server-source-code-divination-clairvoyance-feature.png" target="_blank">
<img src="http://diviner.googlecode.com/files/diviner-poc-server-source-code-divination-clairvoyance-feature.png" width="200" height="150"/>
</a>

<font size="5"><b>How Does it Work?</b></font><br>
Diviner analyzes and reuses the requests found in ZAP's history at at the moment of its activation,<br>
activates the application entry points under different extreme conditions, generates and isolates specific application behaviors, <br>
and uses the information obtained to <b>predict</b> the structure of the <b>server side memory, source code, and processes.</b><br>
These aspects are then presented in the form of a <b>visual map</b>, which includes <b>leads, tasks and payload recommendations</b>.<br><br>
Diviner also attempts to analyze this information in order to locate potential leads for vulnerabilities, <br>
both simple and complex, and provides recommendations for detecting and exploiting them.<br>

The following videos demonstrate the use of some of diviner's features:
<LI> <a href="http://www.youtube.com/watch?v=RmxiUL8ImkA&feature=plcp">Using the Clairvoyance Feature to Gain Insight into the Server Memory, Code and Processes</a>
<LI> <a href="http://www.youtube.com/watch?v=3Gh4_UnUrKg&feature=plcp">Using the Advisor Feature to Detect SQL Injection via Session Attributes</a>
<LI> <a href="http://www.youtube.com/watch?v=YKfIIVi8IN8&feature=plcp">Using the Advisor Feature to Detect XSS via Session Attributes</a>
<br>

<font size="5"><b>Quickstart</b></font><br>
 # Install Diviner directly from ZAP's Add-ons screen.
 # Once Diviner is installed, it can accessed from the tools menu.
 # Prior to using Diviner <b>'Analysis'</b> feature (upper menu), define ZAP as the browser proxy, and <b>manually crawl</b> the application,<br>
while activating the various features and operations with <b>valid input</b>. The better the coverage, the better the result. <br>
It is currently recommended to use diviner only on small to medium sized applications (or on a limited amount of URLs). <br>

<font size="5"><b>Developers</b></font><br>
Diviner is developed and maintained by <a href="http://twitter.com/sectooladdict/">Shay Chen</a>, <a href="http://twitter.com/secure_et">Eran Tamari</a> and <a href="https://twitter.com/nashcontrol">Alex Mor</a>.

<font size="5"><b>Features</b></font><br>

<table border="0">
<tr><td><b><u>Analysis Features</u></b><td><b><u>Coverage Features</u></b>
<tr>
<td valign="top">
<LI><I>Detect Input Reflections (Potential XSS, CRLF Injection, Etc)</I>
<LI><I>Detect Error-Generating Scenarios (Potential Injections)</I>
<LI><I>Detect Content Differentiation Effects (Direct & Indirect Effect of Input)</I>

<td valign="top">
<LI><I>Reuse the Content in ZAP's History</I>
<LI><I>Domain Restrictions</I>
<LI><I>URL Exclusion</I>


<tr><td><b><u>Deduction Processes</u></b><td><b><u>Barrier Support</u></b>
<tr>
<td valign="top">
<LI><I>Convert Behaviors into Pseudo-code Representation of Server-Side Code</I>
<LI><I>Predict the Structure of the Server Side Memory (Session / DB / Etc)</I>
<LI><I>Isolate and Present a Map of the Server-Side Processes</I>
<LI><I>Specific Payload Recommendations</I>

<td valign="top">
<LI><I>Authentication Support</I>
<LI><I>Anti-CSRF Token Support</I>
<LI><I>Resend Updated Values of Required Parameters (VIEWSTATE, Etc)</I>
<LI><I>Replay Relevant History Prior To Resending Requests</I>


<tr><td><b><u>Built-in Plugins</u></b><td><b><u>Integration Features</u></b>
<tr>
<td valign="top">
<LI><I>A Customized Manual Penetration Test Payload Manager</I>
<LI><I>Report Generator</I>

<td valign="top">
<LI><I>Integration With ZAP's 'Resend Request' Feature</I>
<br>
