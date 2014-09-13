/**
 * This file is part of bagarino.
 *
 * bagarino is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * bagarino is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with bagarino.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.bagarino.model;

import io.bagarino.datamapper.ConstructorAnnotationRowMapper.Column;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
public class TicketCategory {
    private final Date inception;
    private final Date end;
    private final int maxTickets;
    private final BigDecimal appliedDiscount;

    public TicketCategory(@Column("inception") Date inception,
                          @Column("expiration") Date expiration,
                          @Column("max_tickets") int maxTickets,
                          @Column("discount") BigDecimal appliedDiscount) {
        this.inception = inception;
        this.end = expiration;
        this.maxTickets = maxTickets;
        this.appliedDiscount = appliedDiscount;
    }
}
