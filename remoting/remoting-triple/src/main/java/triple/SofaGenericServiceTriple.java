/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
    package triple;

import java.util.concurrent.TimeUnit;

import static triple.GenericServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@javax.annotation.processing.Generated(
value = "by SofaTriple generator",
comments = "Source: transformer.proto")
public final class SofaGenericServiceTriple {
private SofaGenericServiceTriple() {}

public static class SofaGenericServiceStub implements IGenericService {

protected int timeout;

protected GenericServiceGrpc.GenericServiceBlockingStub blockingStub;
protected GenericServiceGrpc.GenericServiceFutureStub futureStub;
protected GenericServiceGrpc.GenericServiceStub stub;

public SofaGenericServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, int timeout) {
this.timeout = timeout;

blockingStub = GenericServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = GenericServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = GenericServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public Response generic(Request request) {
    return blockingStub
    .withDeadlineAfter(timeout, TimeUnit.MILLISECONDS)
    .generic(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<Response> genericAsync(Request request) {
    return futureStub
    .withDeadlineAfter(timeout, TimeUnit.MILLISECONDS)
    .generic(request);
    }

    public void generic(Request request, io.grpc.stub.StreamObserver<Response> responseObserver){
    stub
    .withDeadlineAfter(timeout, TimeUnit.MILLISECONDS)
    .generic(request, responseObserver);
    }

}

public static SofaGenericServiceStub getSofaStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions,int timeout) {
return new SofaGenericServiceStub(channel, callOptions, timeout);
}

public static String getServiceName() {
  return GenericServiceGrpc.SERVICE_NAME;
}

public interface IGenericService {
    default public Response generic(Request request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<Response> genericAsync(Request request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void generic(Request request, io.grpc.stub.StreamObserver<Response> responseObserver);

}

public static abstract class GenericServiceImplBase implements io.grpc.BindableService, IGenericService {

private IGenericService proxiedImpl;

public final void setProxiedImpl(IGenericService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @Override
    public final Response generic(Request request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @Override
    public final com.google.common.util.concurrent.ListenableFuture<Response> genericAsync(Request request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void generic(Request request,
                            io.grpc.stub.StreamObserver<Response> responseObserver) {
        asyncUnimplementedUnaryCall(GenericServiceGrpc.getGenericMethod(), responseObserver);
        }

@Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    GenericServiceGrpc.getGenericMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    Request,
    Response>(
    proxiedImpl, METHODID_GENERIC)))
.build();
}
}
    private static final int METHODID_GENERIC = 0;

private static final class MethodHandlers
<Req, Resp> implements
io.grpc.stub.ServerCalls.UnaryMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ServerStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ClientStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.BidiStreamingMethod
<Req, Resp> {
private final IGenericService serviceImpl;
private final int methodId;

MethodHandlers(IGenericService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@Override
@SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_GENERIC:
            serviceImpl.generic((Request) request,
            (io.grpc.stub.StreamObserver<Response>) responseObserver);
            break;
    default:
    throw new AssertionError();
    }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver
    <Req> invoke(io.grpc.stub.StreamObserver
        <Resp> responseObserver) {
            switch (methodId) {
            default:
            throw new AssertionError();
           }
      }
  }

}
