/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.json.*;

/**
 * S3DataSpecMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DataSpecJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(S3DataSpec s3DataSpec, StructuredJsonGenerator jsonGenerator) {

        if (s3DataSpec == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (s3DataSpec.getDataLocationS3() != null) {
                jsonGenerator.writeFieldName("DataLocationS3").writeValue(s3DataSpec.getDataLocationS3());
            }
            if (s3DataSpec.getDataRearrangement() != null) {
                jsonGenerator.writeFieldName("DataRearrangement").writeValue(s3DataSpec.getDataRearrangement());
            }
            if (s3DataSpec.getDataSchema() != null) {
                jsonGenerator.writeFieldName("DataSchema").writeValue(s3DataSpec.getDataSchema());
            }
            if (s3DataSpec.getDataSchemaLocationS3() != null) {
                jsonGenerator.writeFieldName("DataSchemaLocationS3").writeValue(s3DataSpec.getDataSchemaLocationS3());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static S3DataSpecJsonMarshaller instance;

    public static S3DataSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DataSpecJsonMarshaller();
        return instance;
    }

}
