${fileHeader}
package ${metadata.packageName}.model;

import java.io.Serializable;
import javax.annotation.Generated;

<#if shape.documentation?has_content || awsDocsUrl?has_content>
/**
<#if shape.documentation?has_content> * ${shape.documentation}</#if>
<#if awsDocsUrl?has_content> * ${awsDocsUrl}</#if>
 */
</#if>
<#if shape.deprecated>
@Deprecated
</#if>
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ${shape.shapeName} <#if baseClassFqcn??>extends ${baseClassFqcn}</#if>
    implements Serializable, Cloneable {

    <@VariableDeclarationMacro.content shape/>

    <#if shape.additionalConstructors?has_content>
        <@ConstructorDefinitionMacro.content shape/>
    </#if>

    <@MethodDefinitionMacro.content customConfig shape shape.shapeName/>

    <#-- Injection point for adding custom code to model classes -->
    <#if CustomModelClassMethodsMacro??>
        <@CustomModelClassMethodsMacro.content shape/>
    </#if>

    <@OverrideMethodsMacro.content shape/>

    @Override
    public ${shape.shapeName} clone() {
        try {
            return (${shape.shapeName}) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
    }
}
