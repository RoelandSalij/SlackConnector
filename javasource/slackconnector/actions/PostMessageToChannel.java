// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slackconnector.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.ullink.slack.simpleslackapi.events.SlackConnected;
import javafx.geometry.Pos;
import slackconnector.impl.SlackConnector;

public class PostMessageToChannel extends CustomJavaAction<Boolean>
{
	private String AuthenticationToken;
	private String ChannelName;
	private String Message;

	public PostMessageToChannel(IContext context, String AuthenticationToken, String ChannelName, String Message)
	{
		super(context);
		this.AuthenticationToken = AuthenticationToken;
		this.ChannelName = ChannelName;
		this.Message = Message;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		ILogNode logger = Core.getLogger(PostMessageToChannel.class.getName());
		SlackConnector connector = new SlackConnector();
		connector.setLogger(logger);
		connector.postMessage(this.AuthenticationToken,this.ChannelName,this.Message);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "PostMessageToChannel";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}