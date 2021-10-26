# TransformOperation
Example for transform operations used to transform values in attribute mapping between backend and cad integrations

attributes-from-sap.xml

    <APPL_ATTRIBUTE name="SAP_DESCRIPTION" hidden="false">
    <TOLOWERCASE>
	  <FIRSTNONEMPTY>    
        <DIR field="Description"/>
        <DIR field="LONGTEXT" row="0" language="EN"/>
        <DIR field="LONGTEXT" row="0" language="DE"/>		
	  </FIRSTNONEMPTY>
    </TOLOWERCASE>
    </APPL_ATTRIBUTE>

...

    <APPL_ATTRIBUTE name="SAP_DESCRIPTION" hidden="false">
    <TOUPPERCASE>
	  <FIRSTNONEMPTY>    
        <DIR field="Description"/>
        <DIR field="LONGTEXT" row="0" language="EN"/>
        <DIR field="LONGTEXT" row="0" language="DE"/>		
	  </FIRSTNONEMPTY>
    </TOUPPERCASE>
    </APPL_ATTRIBUTE>