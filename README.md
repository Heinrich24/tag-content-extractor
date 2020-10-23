# Tag content extractor

## Introduction  ▶️:
The following project is a simple java based application that will extract text between two valid XML tags.

## HackerRank Problem :duck:
In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

.Criteria:
. The name of the start and end tags must be same. The HTML code &lt;h1&gt;Hello World&lt;/h2&gt; is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
. Tags can be nested, but content between nested tags is considered not valid. For example, in &lt;h1&gt;&lt;a&gt;contents&lt;/a&gt;invalid&lt;/h1&gt;, contents is valid but invalid is not valid.
. Tags can consist of any printable characters.


### HackerRank Level:rabbit:
```diff
- Medium
```

## Set-up 💾
Import project as a java based application

## :thumbsup: Acknowledgement :fire:
I would like to give a shout out to the following article which went a great way in porviding a guide for the solution: https://www.thepoorcoder.com/hackerrank-tag-content-extractor-solution-2/

## License 🎓
[Apache2](https://www.apache.org/licenses/LICENSE-2.0)
