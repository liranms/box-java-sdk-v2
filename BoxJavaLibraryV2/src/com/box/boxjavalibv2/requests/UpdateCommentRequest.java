package com.box.boxjavalibv2.requests;

import com.box.boxjavalibv2.IBoxConfig;
import com.box.boxjavalibv2.jsonparsing.IBoxJSONParser;
import com.box.boxjavalibv2.requests.requestentities.BoxCommentRequestEntity;
import com.box.boxjavalibv2.requests.requestobjects.BoxEntityRequestObject;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;
import com.box.restclientv2.requests.DefaultBoxRequest;

/**
 * Request to update a comment.
 */
public class UpdateCommentRequest extends DefaultBoxRequest {

    private static String URI = "/comments/%s";

    /**
     * Constructor.
     * 
     * @param config
     *            config
     * @param parser
     *            json parser
     * @param commentId
     *            id of the comment
     * @param requestObject
     *            comment request object.
     * @throws BoxRestException
     *             exception
     */
    public UpdateCommentRequest(final IBoxConfig config, final IBoxJSONParser parser, final String commentId,
        final BoxEntityRequestObject<BoxCommentRequestEntity> requestObject) throws BoxRestException {
        super(config, parser, getUri(commentId), RestMethod.PUT, requestObject);
    }

    public static String getUri(final String commentId) {
        return String.format(URI, commentId);
    }
}
