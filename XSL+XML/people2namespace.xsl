<?xml version='1.0'?>

<!-- <xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
	this ns refers to a deprecated version; all browsers should
	support the 1999 standard				-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:p="https://first.com"
xmlns:s ="https://second.com"
xmlns:t="https://third.com"
xmlns:f="https://fourth.com"
xmlns:fif="https://fifth.com"
version="1.0">

<xsl:template match="/">
  <html>
  <body>
  <h2>People name (Hamster Name is green name)</h2>
  <xsl:apply-templates/>
  </body>
  </html>
</xsl:template>

<xsl:template match="p:person">
  <p>
  <xsl:apply-templates select="s:first_name"/>
  <xsl:apply-templates select="fif:surname"/>
  <xsl:apply-templates select="f:name"/>
  <xsl:apply-templates select="t:hamster"/>
  
  </p>
</xsl:template>


<xsl:template match="t:hamster">
<p>
  Hamster: <span style="color:#00ff00">
  <xsl:value-of select="."/></span>
  <br />
  </p>
</xsl:template>


</xsl:stylesheet>

