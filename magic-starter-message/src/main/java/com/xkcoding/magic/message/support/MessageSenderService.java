/*
 * Copyright (c) 2019-2029, xkcoding & Yangkai.Shen & 沈扬凯 (237497819@qq.com & xkcoding.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xkcoding.magic.message.support;

import com.xkcoding.magic.message.model.Message;

/**
 * <p>
 * 消息发送接口
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/10/11 14:25
 */
public interface MessageSenderService<T extends Message> {
	/**
	 * 发送消息
	 *
	 * @param message 消息实体
	 */
	void send(T message);
}
