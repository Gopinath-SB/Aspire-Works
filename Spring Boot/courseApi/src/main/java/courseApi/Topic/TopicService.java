package courseApi.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicrepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}

	public Optional<Topic> getTopic(String id) {
		return topicrepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicrepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicrepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicrepository.deleteById(id);
	}

}
