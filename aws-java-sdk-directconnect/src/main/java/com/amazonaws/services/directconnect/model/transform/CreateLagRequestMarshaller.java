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
package com.amazonaws.services.directconnect.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * CreateLagRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLagRequestMarshaller implements Marshaller<Request<CreateLagRequest>, CreateLagRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateLagRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateLagRequest> marshall(CreateLagRequest createLagRequest) {

        if (createLagRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateLagRequest> request = new DefaultRequest<CreateLagRequest>(createLagRequest, "AmazonDirectConnect");
        request.addHeader("X-Amz-Target", "OvertureService.CreateLag");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (createLagRequest.getNumberOfConnections() != null) {
                jsonGenerator.writeFieldName("numberOfConnections").writeValue(createLagRequest.getNumberOfConnections());
            }
            if (createLagRequest.getLocation() != null) {
                jsonGenerator.writeFieldName("location").writeValue(createLagRequest.getLocation());
            }
            if (createLagRequest.getConnectionsBandwidth() != null) {
                jsonGenerator.writeFieldName("connectionsBandwidth").writeValue(createLagRequest.getConnectionsBandwidth());
            }
            if (createLagRequest.getLagName() != null) {
                jsonGenerator.writeFieldName("lagName").writeValue(createLagRequest.getLagName());
            }
            if (createLagRequest.getConnectionId() != null) {
                jsonGenerator.writeFieldName("connectionId").writeValue(createLagRequest.getConnectionId());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
