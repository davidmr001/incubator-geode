/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gemstone.gemfire.cache30;

import org.junit.Test;

import com.gemstone.gemfire.cache.CacheException;

public abstract class DiskDistributedNoAckRegionTestCase extends DistributedNoAckRegionDUnitTest {

  protected DiskRegionTestImpl regionTestImpl;
  
  @Override
  public final void postSetUp() throws Exception {
    this.regionTestImpl = new DiskRegionTestImpl(this);
  }
  
  @Test
  public void testCreateDiskRegion() throws CacheException {
    this.regionTestImpl.testCreateDiskRegion();
  }
  
  @Test
  public void testBackupFillInValues() throws CacheException {
    this.regionTestImpl.testBackupFillValues();
  }
}
