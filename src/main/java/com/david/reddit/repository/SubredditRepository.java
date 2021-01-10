package com.david.reddit.repository;

import com.david.reddit.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository  extends JpaRepository<Subreddit, Long> {
}
