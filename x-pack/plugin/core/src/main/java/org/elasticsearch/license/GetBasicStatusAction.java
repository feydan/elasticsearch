/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.license;

import org.elasticsearch.action.StreamableResponseActionType;

public class GetBasicStatusAction extends StreamableResponseActionType<GetBasicStatusResponse> {

    public static final GetBasicStatusAction INSTANCE = new GetBasicStatusAction();
    public static final String NAME = "cluster:admin/xpack/license/basic_status";

    private GetBasicStatusAction() {
        super(NAME);
    }

    @Override
    public GetBasicStatusResponse newResponse() {
        return new GetBasicStatusResponse();
    }
}
