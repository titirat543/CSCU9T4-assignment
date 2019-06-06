<?xml version='1.0'?>

<!-- <xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
	this ns refers to a deprecated version; all browsers should
	support the 1999 standard				-->

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
  <h2>People name (Hamster is green name)</h2>
  <xsl:apply-templates/>
  </body>
  </html>
</xsl:template>

<xsl:template match="person">
  <p>
  <xsl:apply-templates select="first_name"/>
  <xsl:apply-templates select="surname"/>
  <xsl:apply-templates select="name"/>
  <xsl:apply-templates select="hamster"/>
  
  </p>
</xsl:template>



<xsl:template match="hamster">
<p>
  Hamster: <span style="color:#00ff00">
  <xsl:value-of select="."/></span>
  <br />
  </p>
</xsl:template>




</xsl:stylesheet>

