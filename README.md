Red5.NET
========

Port of Red5 flash server from java to .NET, using Sharpen conversion utility.

The conversion is incomplete as we stopped working through the conversion mid-process due to no longer needing the feature that required the conversion in the first place. All build errors in the java source have been resolved so that the C# is all generated. However, there are build errors in the C# that have not been resolved or looking into at all.

Run Build-dotnet.xml to perform the conversion.

Versions: 
* red5 0.8.0 - http://red5.googlecode.com/svn/java/server/tags/0_8_0
* Sharpen - Revision 15750 (4/19/11) - https://source.db4o.com/db4o/trunk/sharpen

Requirements:
* NAnt.exe (set path in build-properties.xml)

Sharpen Documentation:
* http://community.versant.com/Blogs/db4o/tabid/197/entryid/95/Default.aspx
* http://community.versant.com/Documentation/Reference/db4o-8.0/net20/reference/index_Left.html#CSHID=sharpen.htm|StartTopic=Content%2Fsharpen.htm|SkinName=RedVersant