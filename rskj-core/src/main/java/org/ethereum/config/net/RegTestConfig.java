/*
 * This file is part of RskJ
 * Copyright (C) 2017 RSK Labs Ltd.
 * (derived from ethereumJ library, Copyright (c) 2016 <ether.camp>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.ethereum.config.net;

import org.ethereum.config.blockchain.regtest.RegTestFirstForkConfig;


/**
 * Created by Anton Nashatyrev on 25.02.2016.
 */
public class RegTestConfig extends AbstractNetConfig {
    public RegTestConfig() {
        add(0, new org.ethereum.config.blockchain.regtest.RegTestConfig());
        // TODO: establish when to apply this fork. 500 is just a made up figure.
        add(500, new RegTestFirstForkConfig());
    }
}