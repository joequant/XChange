/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.hitbtc.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HitbtcCancelReject {

  private final String cancelRequestClientOrderId;
  private final String clientOrderId;
  private final String rejectReasonCode;

  public HitbtcCancelReject(@JsonProperty("cancelRequestClientOrderId") String cancelRequestClientOrderId, @JsonProperty("clientOrderId") String clientOrderId,
      @JsonProperty("rejectReasonCode") String rejectReasonCode) {

    super();
    this.cancelRequestClientOrderId = cancelRequestClientOrderId;
    this.clientOrderId = clientOrderId;
    this.rejectReasonCode = rejectReasonCode;
  }

  public String getCancelRequestClientOrderId() {

    return cancelRequestClientOrderId;
  }

  public String getClientOrderId() {

    return clientOrderId;
  }

  public String getRejectReasonCode() {

    return rejectReasonCode;
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();
    builder.append("HitbtcCancelReject [cancelRequestClientOrderId=");
    builder.append(cancelRequestClientOrderId);
    builder.append(", clientOrderId=");
    builder.append(clientOrderId);
    builder.append(", rejectReasonCode=");
    builder.append(rejectReasonCode);
    builder.append("]");
    return builder.toString();
  }
}
