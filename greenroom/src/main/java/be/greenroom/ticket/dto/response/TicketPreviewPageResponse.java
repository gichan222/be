package be.greenroom.ticket.dto.response;

import java.util.List;

public record TicketPreviewPageResponse(
	List<TicketPreviewResponse> items,
	boolean hasNext,
	String nextCursorCreatedAt
) {
}
