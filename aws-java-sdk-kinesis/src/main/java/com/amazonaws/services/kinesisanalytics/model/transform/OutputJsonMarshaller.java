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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.json.*;

/**
 * OutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Output output, StructuredJsonGenerator jsonGenerator) {

        if (output == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (output.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(output.getName());
            }
            if (output.getKinesisStreamsOutput() != null) {
                jsonGenerator.writeFieldName("KinesisStreamsOutput");
                KinesisStreamsOutputJsonMarshaller.getInstance().marshall(output.getKinesisStreamsOutput(), jsonGenerator);
            }
            if (output.getKinesisFirehoseOutput() != null) {
                jsonGenerator.writeFieldName("KinesisFirehoseOutput");
                KinesisFirehoseOutputJsonMarshaller.getInstance().marshall(output.getKinesisFirehoseOutput(), jsonGenerator);
            }
            if (output.getDestinationSchema() != null) {
                jsonGenerator.writeFieldName("DestinationSchema");
                DestinationSchemaJsonMarshaller.getInstance().marshall(output.getDestinationSchema(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static OutputJsonMarshaller instance;

    public static OutputJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputJsonMarshaller();
        return instance;
    }

}
