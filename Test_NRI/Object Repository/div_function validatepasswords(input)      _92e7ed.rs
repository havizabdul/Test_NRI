<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_function validatepasswords(input)      _92e7ed</name>
   <tag></tag>
   <elementGuidId>f7eab3df-5e6e-431e-9368-9526b1d22fbd</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='basicBootstrapForm']/div[13]/div</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col-md-4 col-xs-4 col-sm-4</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                                                           function validatepasswords(input)                 {                     var password1= document.getElementById(&quot;firstpassword&quot;).value;                     var password2=document.getElementById(&quot;secondpassword&quot;).value;                     if (!(password1==password2))                     {                         input.setCustomValidity('Passwords dont match');                     }                     else                     {                         input.setCustomValidity('');                     }                 }                 function validatepattern(input)                 {                     var password1= document.getElementById(&quot;firstpassword&quot;).value;                     var pattern =/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]){4,6}(?!.*\s ).*$/;                     if (!(pattern.test(input.value)))                     {                         input.setCustomValidity('Please Enter an UpperCase,LowerCase Alphabet and a Number');                     }                     else                     {                         input.setCustomValidity('');                     }                 }                 
                        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;basicBootstrapForm&quot;)/div[@class=&quot;form-group&quot;]/div[@class=&quot;col-md-4 col-xs-4 col-sm-4&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='basicBootstrapForm']/div[13]/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Confirm Password'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/preceding::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Refresh'])[1]/preceding::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[13]/div</value>
   </webElementXpaths>
</WebElementEntity>
